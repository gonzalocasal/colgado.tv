package com.colgado.model;

public class YoutubeDocument {
	
	private String name;
	private DocumentField fields;
	private String createTime;
	private String updateTime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DocumentField getFields() {
		return fields;
	}
	public void setFields(DocumentField fields) {
		this.fields = fields;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
