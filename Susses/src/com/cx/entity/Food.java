package com.cx.entity;

public class Food {
	private Integer fId;
	
	private String fName;
	
	private double fPrice;
	
	private String fImg;
	
	private FoodType type;

	public Integer getfId() {
		return fId;
	}

	public void setfId(Integer fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public double getfPrice() {
		return fPrice;
	}

	public void setfPrice(double fPrice) {
		this.fPrice = fPrice;
	}

	public String getfImg() {
		return fImg;
	}

	public void setfImg(String fImg) {
		this.fImg = fImg;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Food [fId=" + fId + ", fName=" + fName + ", fPrice=" + fPrice + ", fImg=" + fImg + "]";
	}
	
	
}
