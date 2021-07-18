package tv.colgado.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tv.colgado.dto.YoutubeApiResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static tv.colgado.utils.Constants.API_YOUTUBE_URL;

@Log4j2
@Component
public class YoutubeIdsProvider {

	private final String youtubeApiKey;

	private final boolean isScheduleEnabled;

	private final Map<String,String> channelsIds;

	private final Map<String,String> transmissionIds;

	private final RestTemplate restTemplate;

	public YoutubeIdsProvider(@Value("${youtube.api}") String youtubeApiKey,
							  @Value("${schedule.enabled}") boolean isScheduleEnabled,
							  @Value("#{${youtube.api.ids}}")Map<String, String> channelsIds) {

		this.youtubeApiKey = youtubeApiKey;
		this.isScheduleEnabled = isScheduleEnabled;
		this.channelsIds = channelsIds;
		this.transmissionIds = new HashMap<>();
		this.restTemplate = new RestTemplate();
	}

	public String getId(String channel) {
		String transmissionId = transmissionIds.get(channel);
		if (transmissionId == null || transmissionId.isEmpty()) {
			transmissionId = getTransmissionIdFromYoutube(channel);
			transmissionIds.put(channel, transmissionId);
		}
		return transmissionId;
	}

	private String getTransmissionIdFromYoutube(String channel) {
		log.info("Looking in youtube for transmission id of " + channel.toUpperCase());
		String channelId = channelsIds.get(channel);
		String url = String.format(API_YOUTUBE_URL, channelId, youtubeApiKey);
		YoutubeApiResponse response = this.restTemplate.getForObject(url, YoutubeApiResponse.class);
		String transmissionId = "";
		if (response!= null && response.getItems() !=null && !response.getItems().isEmpty())
			transmissionId = response.getItems().get(response.getItems().size() - 1).getId().getVideoId();
		else
			log.info("Transmission not found");
		return transmissionId;
	}

	@Scheduled(cron="0 1 1 * * *")
	private void updateAllIds() {
		if (isScheduleEnabled) {
			log.info("Updating all youtube transmissions IDs");
			String transmissionId;
			for (String channel : channelsIds.keySet()) {
				transmissionId = getTransmissionIdFromYoutube(channel);
				if (!transmissionId.isEmpty()) {
					transmissionIds.put(channel, transmissionId);
				}
				sleep();
			}
		}
	}

	private void sleep() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
