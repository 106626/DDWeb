package com.cx.entity;

import java.util.Date;

public class Mer {
	
	private Integer mId;
	
	private String mName;
	
	private String mPassword;
	
	private String mPhone;
	
	private String mImg;
	
	private Date mStartTime;
	
	private Date mEndTime;
	
	private MerType mertype;

	private MerAddress meraddress;
	
	public Mer() {
		// TODO 自动生成的构造函数存根
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPassword() {
		return mPassword;
	}

	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getmImg() {
		return mImg;
	}

	public void setmImg(String mImg) {
		this.mImg = mImg;
	}

	public Date getmStartTime() {
		return mStartTime;
	}

	public void setmStartTime(Date mStartTime) {
		this.mStartTime = mStartTime;
	}

	public Date getmEndTime() {
		return mEndTime;
	}

	public void setmEndTime(Date mEndTime) {
		this.mEndTime = mEndTime;
	}
	
	public MerType getMertype() {
		return mertype;
	}

	public void setMertype(MerType mertype) {
		this.mertype = mertype;
	}

	public MerAddress getMeraddress() {
		return meraddress;
	}

	public void setMeraddress(MerAddress meraddress) {
		this.meraddress = meraddress;
	}

	@Override
	public String toString() {
		return "Mer [mId=" + mId + ", mName=" + mName + ", mPassword=" + mPassword + ", mPhone=" + mPhone + ", mImg="
				+ mImg + ", mStartTime=" + mStartTime + ", mEndTime=" + mEndTime + "]";
	}
	
	
}
