package com.itzyh.WorkTest.bean;

/**
 * 公司类，打印员工工资
 * @author 38198
 *
 */
public class Company {

	// 打印出某月某个员工的工资数额
	public void getSalary(ColaEmployee c,int month) {
		System.out.println(c.getcName()+"在"+month+"月的月薪为："+c.getSalary(5)+"元");
	}
}
