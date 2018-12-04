package com.cx.entity;

public class Vip {
	private Integer vId;
	
	private Integer vipStatue;
	
	public Vip() {
		// TODO 自动生成的构造函数存根
	}

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public Integer getVipStatue() {
		return vipStatue;
	}

	public void setVipStatue(Integer vipStatue) {
		this.vipStatue = vipStatue;
	}

	@Override
	public String toString() {
		return "Vip [vId=" + vId + ", vipStatue=" + vipStatue + "]";
	}
	
	 
}
