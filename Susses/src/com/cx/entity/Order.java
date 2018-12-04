package com.cx.entity;

import java.util.Date;

public class Order {
	
	private Integer ordId;
	
	private Date ordDate;
	
	private User user;
	
	private Mer mer;

	public Integer getOrdId() {
		return ordId;
	}

	public void setOrdId(Integer ordId) {
		this.ordId = ordId;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mer getMer() {
		return mer;
	}

	public void setMer(Mer mer) {
		this.mer = mer;
	}

	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordDate=" + ordDate + "]";
	}
	
	
}
