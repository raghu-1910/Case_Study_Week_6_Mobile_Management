package com.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //annotation use for creating table in jpa
public class Mobile {
	@Id	//annotation use for primary key
	@Column(name="mid" ,length=10)
	private int mobileId;
	@Column(name="mname",length=15)
	private String mobileName;
	@Column(name="mtype",length=15)
	private String mobileType;
	@Column(name = "mprice", length=10)
	private int mobilePrice;
	@Column(name="mwarenty",length=10)
	private int mobileWarenty;
	@Column(name="mnumber",length=15)
	private int mobileIMEINumber;
	//Using getters and setter create this
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileType() {
		return mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public int getMobileWarenty() {
		return mobileWarenty;
	}
	public void setMobileWarenty(int mobileWarenty) {
		this.mobileWarenty = mobileWarenty;
	}
	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}
	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public Mobile(int mobileId, String mobileName, String mobileType, int mobilePrice, int mobileWarenty,
			int mobileIMEINumber) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileType = mobileType;
		this.mobilePrice = mobilePrice;
		this.mobileWarenty = mobileWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}
	//Use tostring method
	@Override
	public String toString() {
		return "MobileManagement [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileType=" + mobileType
				+ ", mobilePrice=" + mobilePrice + ", mobileWarenty=" + mobileWarenty + ", mobileIMEINumber="
				+ mobileIMEINumber + "]";
	}
	
	
	

}
