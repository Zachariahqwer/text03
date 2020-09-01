package com.itzyh.WorkTest.bean;

/**
 * 拿固定工资的子类
 * @author 38198
 *
 */
public class SalariedEmployee extends ColaEmployee {

	private double monSalary; // 月薪

	public SalariedEmployee(String cName, int cMonth,double monSalary) {
		super(cName,cMonth);
		this.monSalary = monSalary;
	}

	// 工资
	public double getSalary(int month) {
		
		if (super.getcMonth() == month) {
			return monSalary + 100;
		}else {
			return monSalary;
		}
	}
	
	
}
