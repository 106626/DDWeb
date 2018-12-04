package com.cx.entity;

public class FoodType {
	private Integer fTId;
	
	private String fTName;

	public Integer getfTId() {
		return fTId;
	}

	public void setfTId(Integer fTId) {
		this.fTId = fTId;
	}

	public String getfTName() {
		return fTName;
	}

	public void setfTName(String fTName) {
		this.fTName = fTName;
	}

	@Override
	public String toString() {
		return "FoodType [fTId=" + fTId + ", fTName=" + fTName + "]";
	}
	
	
}
