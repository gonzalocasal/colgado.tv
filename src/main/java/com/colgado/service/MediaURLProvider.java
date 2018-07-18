package com.colgado.service;

import static com.colgado.utils.Constants.SOURCE_TELEFE;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.colgado.pojo.TelefePojo;
import com.google.gson.Gson;

@Component
public class MediaURLProvider {

	final static Logger LOGGER = Logger.getLogger(MediaURLProvider.class);

	public Object getMediaURL(String source, String clazz){
		Class<?> className = getClassName(clazz);
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(source);
		HttpResponse response = execute(client,request);
		String json = parseResponse(response);
		Gson gson = new Gson ();
        return gson.fromJson(json,className );
	}

	public String getTelefeURL() {
		LOGGER.info("Looking for Telefe transmission URL");
		TelefePojo result = (TelefePojo) getMediaURL(SOURCE_TELEFE,TelefePojo.class.getName());
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
