package com.colgado.service;

import static com.colgado.utils.Constants.*;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.colgado.pojo.ContARPojo;
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
	
}
