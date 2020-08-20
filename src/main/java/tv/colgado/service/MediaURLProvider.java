package tv.colgado.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static tv.colgado.utils.Constants.API_TELEFE_URL;

@Component
public class MediaURLProvider {

	private final static Logger LOGGER = Logger.getLogger(MediaURLProvider.class);

	public String getTelefeURL() {
		LOGGER.info("Looking for Telefe transmission URL");
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(API_TELEFE_URL);
		HttpResponse response = execute(client,request);
		try {
			return EntityUtils.toString(response.getEntity(), "UTF-8");
		} catch (IOException e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	private HttpResponse execute(HttpClient client, HttpGet request) {
		try {
			return client.execute(request);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
