package com.itzyh.day05;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


/**
 * SimpleDateFormatTest时间工具类的用法
 * @author 38198
 *
 */
public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品的生产日期：(yyyy-MM-dd)");
		String sDate = sc.next();
		System.out.println("请输入保质期(天：)");
		int bDate = sc.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(sDate);
		Calendar cd = Calendar.getInstance();
		cd.setTime(date1);
		cd.add(Calendar.DAY_OF_MONTH, +bDate);
		
		// 将加完天数后的日期转成字符串
//		Date time = cd.getTime();

		Calendar c2 = Calendar.getInstance();
		boolean b = c2.after(cd);
		String nowDate = sdf.format(new Date());	
		long t1 = cd.getTimeInMillis();
		long t2 = c2.getTimeInMillis();
		if (b) {
			System.out.println("今天的日期是："+nowDate);
			System.out.println("该商品已经过期!");
		}else {
			long days = (t1-t2)/(24*60*60*1000);
			System.out.println("今天的日期是："+nowDate);
			System.out.println("还有"+days+"天过期!");
		}
	}
}
