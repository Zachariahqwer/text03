package com.itzyh.day02;

import java.util.Random;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 1、静态初始化
//		int[] numArr = {1,2,3};
//		int[] numArr2 = new int[] {1,2,3,4};
//		
//		// 2、动态初始化
//		String[] strArr = new String[3];
//		
//		for(int i=0 ;i<numArr.length;i++) {
//			System.out.println(numArr[i]);
//		}
//		
//		// foreach循环遍历数组
//		for(int i:numArr2) {
//			System.out.println(i);
//		}
//		
		
		int[] a = new int[5];
		Test_4_01(a);
	}
	
	
	public static void Test_4_01(int b[]) {
		
		Random random = new Random();
		// 循环赋值
		for(int i = 0;i<5;i++) {
			b[i] = random.nextInt(10);
		}
		// foreach遍历数组
		for(int num:b) {
			System.out.println(num);
		}
		
	}

}
