package com.cx.entity;

public class MerAddress {
	
	private Integer mAId;
	
	private Province province;
	
	private City city;
	
	private Area area;
	
	public MerAddress() {
		// TODO 自动生成的构造函数存根
	}

	public Integer getmAId() {
		return mAId;
	}

	public void setmAId(Integer mAId) {
		this.mAId = mAId;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "MerAddress [mAId=" + mAId + "]";
	}
	
	
}
