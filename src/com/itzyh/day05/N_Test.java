package com.itzyh.day05;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author 38198
 *
 */
public class N_Test {

	public static void main(String[] args) {
//		getNumber();
//		getArea();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输出两个数：");
		Integer a = Integer.valueOf(sc.next());
		Integer b = Integer.valueOf(sc.next());
		getSum(a, b);
		
	}
	
	/**
	 * 第九章 课堂练习 输入手机号，将中间四位使用星号替代
	 */
	public static void getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入11位手机号：");
		String num = sc.nextLine();
		// substring方法会返回一个新的字符串，不包含end结尾数据
		String pNum = num.substring(0,3)+"****"+num.substring(7, num.length());
		System.out.println(num);
		System.out.println(pNum);
	}
	/**
	 * 第九章 课堂练习 使用海伦公式求出三角形的面积
	 */
	public static void getArea() {
		
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc = new Scanner(System.in);
		System.out.println("输出三角形的三边：");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double p = (a+b+c)/2;
		double s = Math.sqrt(Math.abs( p*(p-a)*(p-b)*(p-c) ));
		System.out.println("面积："+df.format(s));
	}
	
	/**
	 * 第9章 课后作业 1 输出两个字符串类型的数值之和
	 * @param a
	 * @param b
	 */
	public static void getSum(int a,int b) {
		
		System.out.println("两数之和："+(a+b));
	}
}
