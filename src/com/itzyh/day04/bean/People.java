package com.itzyh.day04.bean;

/**
 * 父类
 * @author 38198
 *
 */
public class People {

	private String pName;
	private int pAge;
	private String pSex;
	
	
	
	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getpAge() {
		return pAge;
	}


	public void setpAge(int pAge) {
		this.pAge = pAge;
	}


	public String getpSex() {
		return pSex;
	}


	public void setpSex(String pSex) {
		this.pSex = pSex;
	}


	public People(String pName, int pAge, String pSex) {
		this.pName = pName;
		this.pAge = pAge;
		this.pSex = pSex;
	}


	public void sayHello() {
		System.out.println("Hello");
	}
	
}
