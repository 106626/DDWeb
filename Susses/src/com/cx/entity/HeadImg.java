package com.cx.entity;

public class HeadImg {
	private Integer hId;
	
	private String hUrl;
	
	private String hType;
	
	private User user;
	
	public HeadImg() {
		// TODO 自动生成的构造函数存根
	}

	public Integer gethId() {
		return hId;
	}

	public void sethId(Integer hId) {
		this.hId = hId;
	}

	public String gethUrl() {
		return hUrl;
	}

	public void sethUrl(String hUrl) {
		this.hUrl = hUrl;
	}

	public String gethType() {
		return hType;
	}

	public void sethType(String hType) {
		this.hType = hType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "HeadImg [hId=" + hId + ", hUrl=" + hUrl + ", hType=" + hType + "]";
	}
	
	
}
