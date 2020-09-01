package com.itzyh.WorkTest.bean;

/**
 * 第7章 课后作业4 ColaEmployee所有员工的父类
 * @author 38198
 *
 */
public class ColaEmployee {

	private String cName;
	private int cMonth;
	
	public double getSalary(int month) {
		
		return 0;
	}
	
	public ColaEmployee() {
		
	}
	// 构造函数
	public ColaEmployee(String cName, int cMonth) {
		super();
		this.cName = cName;
		this.setcMonth(cMonth);
	}

	public int getcMonth() {
		return cMonth;
	}

	public void setcMonth(int cMonth) {
		this.cMonth = cMonth;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
}
