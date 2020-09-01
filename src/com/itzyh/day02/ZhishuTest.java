package com.itzyh.day02;

import java.util.Arrays;

public class ZhishuTest {
	
	public static void main(String[] args) {
		
//		System.out.println(zhiSun());
//		
//		System.out.println(jieCheng(6));
		
		int[] arr = {3,5,6,9,3,1};
		maoPao(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	/**
	 * 判断大于200的质数
	 * 质数：除了1和本身之外不能被其他数整除
	 * @return
	 */
	public static int zhiSun() {
		
		for(int i = 201;;i++) {
			int j =2;
			for(;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j == i) {
				return j;
			}		
		}
	}
	
	/**
	 * 实现阶乘  递归方法
	 * @param num
	 * @return
	 */
	public static long jieCheng(int num) {
		// 
		if(num==1) {
			return 1;
		}else {
			return num*jieCheng(num-1);
		}
	}
	
	/**
	 * 冒泡排序法
	 * @param arr
	 */
	public static void maoPao(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
