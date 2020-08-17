package tv.colgado.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tv.colgado.dto.YoutubeApiResponse;
import java.util.HashMap;
import java.util.Map;

import static tv.colgado.utils.Constants.YOUTUBE_API_URL;

@Component
public class YoutubeIdsProvider {

	final static Logger LOGGER = Logger.getLogger(YoutubeIdsProvider.class);

	@Value("${youtube.api}")
	private String youtubeApiKey;

	@Value("${schedule.enabled}")
	private boolean isScheduleEnabled;

	@Value("#{channelsIds}")
	private Map<String,String> channelsIds;

	private Map<String,String> transmissionIds = new HashMap<>();

	private RestTemplate restTemplate = new RestTemplate();

	public String getId(String channel) {
		String transmissionId = transmissionIds.get(channel);
		if (transmissionId == null || transmissionId.isEmpty()) {
			transmissionId = getTransmissionIdFromYoutube(channel);
			transmissionIds.put(channel, transmissionId);
		}
		return transmissionId;
	}

	private String getTransmissionIdFromYoutube(String channel) {
		LOGGER.info("Looking in youtube for transmission id of " + channel.toUpperCase());
		String channelId = channelsIds.get(channel);
		String url = String.format(YOUTUBE_API_URL, channelId, youtubeApiKey);
		YoutubeApiResponse response = this.restTemplate.getForObject(url, YoutubeApiResponse.class);
		String transmissionId = "";
		if (response!= null && response.getItems() !=null && !response.getItems().isEmpty())
			transmissionId = response.getItems().get(0).getId().getVideoId();
		else
			LOGGER.info("Transmission not found");
		return transmissionId;
	}

	@Scheduled(fixedRate=60*720*1000)
	private void updateAllIds() {
		if (isScheduleEnabled) {
			LOGGER.info("Updating all youtube transmissions IDs");
			String transmissionId;
			for (String channel : channelsIds.keySet()) {
				transmissionId = getTransmissionIdFromYoutube(channel);
				if (!transmissionId.isEmpty()) {
					transmissionIds.put(channel, transmissionId);
				}
			}
		}
	}

}
