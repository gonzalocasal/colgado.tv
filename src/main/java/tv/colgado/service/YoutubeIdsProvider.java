package tv.colgado.service;

import tv.colgado.dto.YoutubeApiItem;
import tv.colgado.dto.YoutubeApiResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

import static tv.colgado.utils.Constants.YOUTUBE_API_URL;

@Component
public class YoutubeIdsProvider {

	final static Logger LOGGER = Logger.getLogger(YoutubeIdsProvider.class);

	@Value("${youtube.api}")
	private String youtubeApiKey;
	
	
	@Value("#{channelsIds}")
	private Map<String,String> channelsIds;

	public String getId(String channel) {
		LOGGER.info("Looking in youtube for transmission id of " + channel.toUpperCase());
		RestTemplate restTemplate = new RestTemplate();
		String channelId = channelsIds.get(channel);
		String url = String.format(YOUTUBE_API_URL, channelId, youtubeApiKey);
		YoutubeApiResponse response = restTemplate.getForObject(url, YoutubeApiResponse.class);
		List<YoutubeApiItem> items = response.getItems();
		String videoId = "";
		if(items.isEmpty()) {
			LOGGER.info("Transmission not found");
		}
		else {
			videoId = items.get(0).getId().getVideoId();
			LOGGER.info("Received Transmission id: " + videoId);
		}
		return videoId;
	}

}
