package com.itzyh.day03;

/**
 * 员工类
 * @author 38198
 *
 */
public class ClassTest {
	
	// 属性
	public String eName;
	public int eAge;
	public double eSal;
		
	// 显示姓名方法
	public String getEName() {
		System.out.println(eName);
		return eName;
	}
	// 显示年龄
	public int getEAge() {
		System.out.println(eAge);
		return eAge;
	}
	// 修改姓名
	public void setEName(String eName) {	
		this.eName = eName;
	}
	// 修改年龄
	public void setEAge(int eAge) {
		this.eAge = eAge;
	}
	
}
