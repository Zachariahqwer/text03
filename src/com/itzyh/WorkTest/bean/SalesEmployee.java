package com.itzyh.WorkTest.bean;

/**
 * 工资由月销售额和提成率决定的员工子类
 * @author 38198
 *
 */
public class SalesEmployee extends ColaEmployee {

	private int mSales;
	private double mTicheng;
	public int getmSales() {
		return mSales;
	}
	public void setmSales(int mSales) {
		this.mSales = mSales;
	}
	public double getmTicheng() {
		return mTicheng;
	}
	public void setmTicheng(double mTicheng) {
		this.mTicheng = mTicheng;
	}
	public SalesEmployee(String cName, int cMonth,int mSales, double mTicheng) {
		super(cName,cMonth);
		this.mSales = mSales;
		this.mTicheng = mTicheng;
	}
	
	// 工资 = 月销售额 * 提成率
	public double getSalary(int month) {
		
		if (super.getcMonth() == month) {
			return this.mSales * this.mTicheng + 100;
		}else {
			return this.mSales * this.mTicheng;
		}
	}
	
	
}
