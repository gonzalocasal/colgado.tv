package com.colgado.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.colgado.pojo.TelefePojo;

@Component
public class MediaURLProvider {

	final static Logger LOGGER = Logger.getLogger(MediaURLProvider.class);

	public Object getMediaURL(String source, String clazz){
		RestTemplate restTemplate = new RestTemplate();
		Class<?> className = getClassName(clazz);
		return restTemplate.getForObject(source, className);
	}

	public String getTelefeURL() {
		LOGGER.info("Looking for Telefe transmission URL");
		TelefePojo result = (TelefePojo) getMediaURL("http://m3u8.futbollibre.online/hls/telefe2.php",TelefePojo.class.getName());
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
	
}
