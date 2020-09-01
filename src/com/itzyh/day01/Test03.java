package com.itzyh.day01;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
		int i = 1,sum = 0;
//		while( i<=100) {
//			sum = sum + i;
//			i++;
//		}
		
//		do {
//			sum = sum + i;
//			i++;
//		} while (i<=100);
		
		for(int j=1;j<=100;j++) {
			sum += j;
		}
		
		System.out.println("和："+sum);
		
//		int num = Test_3_01();
//		System.out.println(num);
//		
//		int price = Test_3_02();
//		System.out.println(price);
		
		Test_3_03();
	}
	
	/**
	 * 第三章课堂练习  1-100奇数相加的和
	 * @return
	 */
	public static int Test_3_01() {
		
//		int i = 1;
		int sum = 0;
//		while(i <= 100) {
//			if(i%2!=0) {
//				sum += i;
//			}
//			i++;
//		}
		for(int i=1;i<=100;i+=2) {
			sum += i;
		}
		return sum;
	}
	
	/**
	 * 第三章课堂练习  计算用户花费
	 * @return
	 */
	public static int Test_3_02() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5个整数：");
		int price = 0;
		for(int i=1;i<=5;i++) {
			int num = sc.nextInt();
			price += num;
		}
		
		return price;
	}
	
	/**
	 * 用户猜谜游戏
	 */
	public static void Test_3_03() {
		Random rd = new Random();
		int num = rd.nextInt(10);
		System.out.println("生成的随机数为："+num);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入3个整数：");
		int guess = 0;
		StringBuffer sb = new StringBuffer();
		for (int i=1;i<=3;i++) {
			guess = sc.nextInt();
			sb.append(guess);
		}
		if (guess == num) {
			System.out.println("猜对了");
		}else{
			System.err.println("没猜到");
		}
		
	}
}

