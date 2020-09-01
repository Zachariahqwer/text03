package com.itzyh.day05;

import java.util.Calendar;

/**
 * Calendar时间工具类的用法
 * @author 38198
 *
 */
public class CalendarTest {

	public static void main(String[] args) {
		
		//抽象类，通过getInstance方法来创建对象
		Calendar cd = Calendar.getInstance();
		cd.set(2020, 7, 27);
		System.out.println(cd.get(Calendar.YEAR)+"-"+cd.get(Calendar.MONTH)+"-"+cd.get(Calendar.DAY_OF_MONTH));
	}
}
