package tv.colgado.service;

import lombok.extern.log4j.Log4j2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;

@Log4j2
@Component
public class MediaURLProvider {

	public String getURL(String channelURL) {
		log.info("Looking for at {} URL to get Transmission URL", channelURL);
		String parsedUrl = "";
		try {
			Document doc = Jsoup.connect(channelURL)
					.userAgent("Mozilla/5.0")
					.get();

			parsedUrl = doc.getElementsByClass("iframe-container").get(0).childNode(1).attributes().get("src");
			if (parsedUrl.startsWith("/embed")) {
				URL url = new URL(channelURL);
				parsedUrl = "https://" + url.getHost() + parsedUrl;
			}

			log.info("Parsed URL: {}", parsedUrl);
			return parsedUrl;
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		return parsedUrl;
	}

}
