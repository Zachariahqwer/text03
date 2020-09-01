package com.itzyh.WorkTest.test;

import com.itzyh.WorkTest.bean.ColaEmployee;
import com.itzyh.WorkTest.bean.Company;
import com.itzyh.WorkTest.bean.HourlyEmployee;
import com.itzyh.WorkTest.bean.SalariedEmployee;
import com.itzyh.WorkTest.bean.SalesEmployee;

public class CompanyTest {

	public static void main(String[] args) {
		// 创建数组
		ColaEmployee[] c1 = {
				new SalariedEmployee("徐艺洋", 7, 30000.0), //月薪 
				new HourlyEmployee("刘些宁",5,100,300),// 时
				new SalesEmployee("宋妍霏", 3, 70000, 0.3), // 月销售额	
		};
		
		for(ColaEmployee c:c1) {
			new Company().getSalary(c, 7);
		}
	}
}
