package com.colgado.task;

import static com.colgado.utils.Constants.*;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.colgado.model.FieldId;
import com.colgado.model.YoutubeApiRequest;
import com.colgado.model.YoutubeApiRequestFields;
import com.colgado.model.YoutubeApiResponse;
import com.colgado.model.YoutubeDocument;

@Component
public class YoutubeIdsProvider {

	final static Logger LOGGER = Logger.getLogger(YoutubeIdsProvider.class);

	@Value("${youtube.api.key}")
	private String youtubeApiKey;
	
	@Value("${firestore.api.key}")
	private String fireStoreApiKey;
	
	@Value("${firestore.project.id}")
	private String fireStoreProjectId;
	
	@Value("#{channelsIds}")
	private Map<String,String> channelsIds;
	
	
	public String getId(String documentId) {
		String url = String.format(COLLECTION_YOUTUBE_URL, fireStoreProjectId, documentId, fireStoreApiKey);
		LOGGER.info("Getting youtube transmission id for: "+documentId);
		RestTemplate restTemplate = new RestTemplate();
		YoutubeDocument document = restTemplate.getForObject(url, YoutubeDocument.class);
		return document.getFields().getId().getStringValue();
	}
	
	@Scheduled(fixedRate = 600000, initialDelay = 0)
	public void getUpdatedYoutubeIds() {
		RestTemplate restTemplate = new RestTemplate();
		for (String key : channelsIds.keySet()) {
			String channelId = channelsIds.get(key);
			String url = String.format(YOUTUBE_API_URL, channelId, youtubeApiKey);
			LOGGER.info("Looking in youtube for transmission id of "+key);
			YoutubeApiResponse response = restTemplate.getForObject(url, YoutubeApiResponse.class);
			LOGGER.info(response.getItems());
			String videoId = response.getItems().get(0).getId().getVideoId();
			LOGGER.info("Received Transmission id: "+videoId);
			updateChannelId(key, videoId);
		}
	}

	private void updateChannelId(String channel, String transmissionId){
		RestTemplate restTemplate = new RestTemplate();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		restTemplate.setRequestFactory(requestFactory);
		
		String url = String.format(COLLECTION_YOUTUBE_URL, fireStoreProjectId, channel, fireStoreApiKey);
		LOGGER.info("Updating DB with new transmission id of: "+ channel);
		YoutubeApiRequest request =  generateYoutubeRequest(transmissionId) ;
		final HttpEntity<?> requestEntity = new HttpEntity<>(request);

		restTemplate.exchange(url, HttpMethod.PATCH, requestEntity, Void.class);
	}

	private YoutubeApiRequest generateYoutubeRequest(String transmissionId) {
		YoutubeApiRequest youtubeApiRequest = new YoutubeApiRequest();
		YoutubeApiRequestFields fields = new YoutubeApiRequestFields();
		FieldId id = new FieldId();
		id.setStringValue(transmissionId);
		fields.setId(id);
		youtubeApiRequest.setFields(fields);
		return youtubeApiRequest;
	}
	
}
