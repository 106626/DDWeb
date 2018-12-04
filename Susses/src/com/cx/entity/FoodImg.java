package com.cx.entity;

public class FoodImg {
	private Integer fiId;
	
	private String fiUrl;
	
	private String fiType;

	public Integer getFiId() {
		return fiId;
	}

	public void setFiId(Integer fiId) {
		this.fiId = fiId;
	}

	public String getFiUrl() {
		return fiUrl;
	}

	public void setFiUrl(String fiUrl) {
		this.fiUrl = fiUrl;
	}

	public String getFiType() {
		return fiType;
	}

	public void setFiType(String fiType) {
		this.fiType = fiType;
	}

	@Override
	public String toString() {
		return "FoodImg [fiId=" + fiId + ", fiUrl=" + fiUrl + ", fiType=" + fiType + "]";
	}
	
	
}
