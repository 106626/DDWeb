package com.cx.entity;

public class City {
	private Integer cID;
	
	private String cName;
	
	private Province province;
	
	public City() {
		// TODO 自动生成的构造函数存根
	}

	public Integer getcID() {
		return cID;
	}

	public void setcID(Integer cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "City [cID=" + cID + ", cName=" + cName + "]";
	}
}
