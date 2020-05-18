package tv.colgado.service;

import tv.colgado.dto.TelefePojo;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static tv.colgado.utils.Constants.SOURCE_TELEFE;

@Component
public class MediaURLProvider {

	private final static Logger LOGGER = Logger.getLogger(MediaURLProvider.class);

	private Object getMediaURL(String source, String clazz){
	    Class<?> className = getClassName(clazz);
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(source);
		HttpResponse response = execute(client,request);
		Gson gson = new Gson ();
        return gson.fromJson((response != null) ? parseResponse(response) : "" , className);
	}

	public String getTelefeURL() {
		LOGGER.info("Looking for Telefe transmission URL");
		TelefePojo result = (TelefePojo) getMediaURL(SOURCE_TELEFE, TelefePojo.class.getName());
		return result.getTelefe();
	}
	
	private Class<?> getClassName(String clazz) {
		Class<?> className = null;
		try {
			className = Class.forName(clazz);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return className;
	}
	
	private HttpResponse execute(HttpClient client, HttpGet request) {
		try {
			return client.execute(request);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String parseResponse(HttpResponse response) {
		try {
			String entity = EntityUtils.toString(response.getEntity(), "UTF-8");
			LOGGER.info("Response Code : " + response.getStatusLine().getStatusCode() + " ::: "+ entity);
			return entity;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
