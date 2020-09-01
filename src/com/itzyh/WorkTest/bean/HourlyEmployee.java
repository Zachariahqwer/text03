package com.itzyh.WorkTest.bean;

/**
 * 按小时拿工资的员工子类
 * @author 38198
 *
 */
public class HourlyEmployee extends ColaEmployee {

	private int hSalay;
	private int mHour;
	public double gethSalay() {
		return hSalay;
	}
	public void sethSalay(int hSalay) {
		this.hSalay = hSalay;
	}
	public double getmHour() {
		return mHour;
	}
	public void setmHour(int mHour) {
		this.mHour = mHour;
	}
	
	
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HourlyEmployee(String cName, int cMonth,int hSalay,int mHour) {
		super(cName, cMonth);
		// TODO Auto-generated constructor stub
		this.hSalay = hSalay;
		this.mHour = mHour;
	}
	
	/*
	 *  小时工的工资情况(non-Javadoc)
	 *  	1.每月工作超出160小时；
	 		2.每月工作超出160 小时 + （该月过生日）100；
	 		
	 		3.每月工作没超出160小时；
	 		4.每月工作没超出160小时+ （该月过生日）100；
	 * @see com.itzyh.WorkTest.bean.ColaEmployee#getSalary(int)
	 */
	public double getSalary(int month) {
		if(super.getcMonth() == month) {
			if(this.mHour>160) {
				 return this.hSalay*160 + (this.mHour-160)*1.5*this.hSalay+100;
			}else {
				return this.hSalay*mHour + 100;
			}
		}else {
			if(this.mHour>160) {
				 return this.hSalay*160 + (this.mHour-160)*1.5*this.hSalay;
			}else {
				return this.hSalay*mHour;
			}
		}
		
	}
}
