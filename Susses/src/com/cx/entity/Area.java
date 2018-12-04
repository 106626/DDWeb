package com.cx.entity;

public class Area {
	private Integer aId;
	
	private String cName;
	
	private City city;
	
	public Area() {
		// TODO 自动生成的构造函数存根
	}

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Area [aId=" + aId + ", cName=" + cName + "]";
	}
	
	
}
