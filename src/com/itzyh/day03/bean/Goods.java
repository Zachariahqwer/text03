package com.itzyh.day03.bean;

public class Goods {

	String gName;
	double gPrice;
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public double getgPrice() {
		return gPrice;
	}
	public void setgPrice(double gPrice) {
		this.gPrice = gPrice;
	}
	public Goods(String gName, double gPrice) {
		super();
		this.gName = gName;
		this.gPrice = gPrice;
	}
	
	
	
}
