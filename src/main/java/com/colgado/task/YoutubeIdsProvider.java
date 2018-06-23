package com.colgado.task;

import static com.colgado.utils.Constants.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.colgado.model.YoutubeDocument;

@Component
public class YoutubeIdsProvider {
	

	final static Logger LOGGER = Logger.getLogger(YoutubeIdsProvider.class);

	@Value("${firestore.api.key}")
	private String fireStoreApiKey;
	
	@Value("${firestore.project.id}")
	private String fireStoreProjectId;
	
	
	public String getId(String documentId) {
		String url = String.format(COLLECTION_YOUTUBE_URL, fireStoreProjectId, documentId, fireStoreApiKey);
		RestTemplate restTemplate = new RestTemplate();
		YoutubeDocument document = restTemplate.getForObject(url , YoutubeDocument.class);
		return document.getFields().getId().getStringValue();
	}

}
