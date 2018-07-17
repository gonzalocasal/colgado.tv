package com.colgado.service;

import static com.colgado.utils.Constants.SOURCE_DEPORTV;
import static com.colgado.utils.Constants.SOURCE_ENCUENTRO;
import static com.colgado.utils.Constants.SOURCE_PAKAPAKA;
import static com.colgado.utils.Constants.SOURCE_TECTV;
import static com.colgado.utils.Constants.SOURCE_TELEFE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.colgado.pojo.ContARPojo;
import com.colgado.pojo.TelefePojo;
import com.google.gson.Gson;

@Component
public class MediaURLProvider {

	final static Logger LOGGER = Logger.getLogger(MediaURLProvider.class);

	public Object getMediaURL(String source, String clazz){
		
		Class<?> className = getClassName(clazz);
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(source);
		
		request.addHeader("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
		request.addHeader("origin", "https://www.cont.ar");
		request.addHeader("referer", "https://www.cont.ar");
		request.addHeader("x-csrf-token", "LL8dqdktXCS4SCpajnWiecp1NxvAC6SRTcejACWn");
		request.addHeader("x-requested-with", "XMLHttpRequest");
		
		HttpResponse response = execute(client,request);
		
		LOGGER.info("Response Code : " + response.getStatusLine().getStatusCode());
		
		String json = parseResponse(response);

		Gson gson = new Gson ();
        return gson.fromJson(json,className );
	}

	public String getTelefeURL() {
		LOGGER.info("Looking for Telefe transmission URL");
		TelefePojo result = (TelefePojo) getMediaURL(SOURCE_TELEFE,TelefePojo.class.getName());
		return result.getTelefe();
	}
	
	public String getEncuentroURL() {
		LOGGER.info("Looking for Encuentro transmission URL");
		ContARPojo result = (ContARPojo) getMediaURL(SOURCE_ENCUENTRO,ContARPojo.class.getName());
		return result.getData().getHls();
	}

	public String getDeporTVURL() {
		LOGGER.info("Looking for DeporTV transmission URL");
		ContARPojo result = (ContARPojo) getMediaURL(SOURCE_DEPORTV,ContARPojo.class.getName());
		return result.getData().getHls();
	}

	public String getPakaPakaURL() {
		LOGGER.info("Looking for Paka Paka transmission URL");
		ContARPojo result = (ContARPojo) getMediaURL(SOURCE_PAKAPAKA,ContARPojo.class.getName());
		return result.getData().getHls();
	}
	
	public String getTecTVURL() {
		LOGGER.info("Looking for TEC TV transmission URL");
		ContARPojo result = (ContARPojo) getMediaURL(SOURCE_TECTV,ContARPojo.class.getName());
		return result.getData().getHls();
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
			return EntityUtils.toString(response.getEntity(), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
