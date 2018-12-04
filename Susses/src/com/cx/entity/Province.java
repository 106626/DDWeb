package com.cx.entity;

public class Province {
	private Integer pId;
	
	private String pName;
	
	public Province() {
		// TODO 自动生成的构造函数存根
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Province [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
}
