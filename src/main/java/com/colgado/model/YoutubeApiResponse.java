package com.colgado.model;

import java.util.List;

public class YoutubeApiResponse {
	
	private List<YoutubeApiItem> items;

	
	public List<YoutubeApiItem> getItems() {
		return items;
	}

	public void setItems(List<YoutubeApiItem> items) {
		this.items = items;
	}

}
