package com.cx.entity;

public class Admi {
	private Integer admiID;
	
	private String admiName;
	
	private String admiPassword;
	
	public Admi() {
		// TODO 自动生成的构造函数存根
	}

	public Integer getAdmiID() {
		return admiID;
	}

	public void setAdmiID(Integer admiID) {
		this.admiID = admiID;
	}

	public String getAdmiName() {
		return admiName;
	}

	public void setAdmiName(String admiName) {
		this.admiName = admiName;
	}

	public String getAdmiPassword() {
		return admiPassword;
	}

	public void setAdmiPassword(String admiPassword) {
		this.admiPassword = admiPassword;
	}

	@Override
	public String toString() {
		return "Admi [admiID=" + admiID + ", admiName=" + admiName + ", admiPassword=" + admiPassword + "]";
	}
	
}
