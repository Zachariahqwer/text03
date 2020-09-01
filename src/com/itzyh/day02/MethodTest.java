package com.itzyh.day02;

import java.util.Random;

public class MethodTest {
	public static void main(String[] args) {

		Random random = new Random();
		int n1= random.nextInt(10);
		int n2= random.nextInt(20);
		int a = 5, b = 8;
		sum();

		int sum1 = sum1(n1, n2);
		System.out.println(sum1);

		int cha = cha(a, b);
		System.out.println("两数之差："+cha);
		hello();
	}

	// 无参 计算两个数的和
	public static void sum() {
		int a = 1, b = 2, sum = 0;
		sum = a + b;
		System.out.println("两数之和：" + sum);
	}

	// 形参 计算两个数的差
	public static int cha(int a, int b) {
		int cha = 0;
		cha = a > b ? a - b : b - a;
		// 用数学函数绝对值实现
//		return Math.abs(a-b);
		return cha;
	}

	public static int sum1(int a, int b) {
		int sum = 0;
		return a + b;
	}

	public static void hello() {
		System.out.println("Hello");
	}
	
	
}
