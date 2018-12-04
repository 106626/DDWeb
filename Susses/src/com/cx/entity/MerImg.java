package com.cx.entity;

public class MerImg {
	
	private Integer mId;
	
	private String mUrl;
	
	private String mType;
	
	private Mer mer;

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getmUrl() {
		return mUrl;
	}

	public void setmUrl(String mUrl) {
		this.mUrl = mUrl;
	}

	public String getmType() {
		return mType;
	}

	public void setmType(String mType) {
		this.mType = mType;
	}

	public Mer getMer() {
		return mer;
	}

	public void setMer(Mer mer) {
		this.mer = mer;
	}

	@Override
	public String toString() {
		return "MerImg [mId=" + mId + ", mUrl=" + mUrl + ", mType=" + mType + "]";
	}
	
	
}
