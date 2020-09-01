package com.itzyh.day02;

import java.util.Scanner;

public class YearTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输出年份：");
		int year = scanner.nextInt();
		System.out.println(isYear(year));
	}

	/**
	 * 能被4整数且不能被100整除，或者能被400整除
	 * 
	 * @return
	 */
	public static String isYear(int a) {

		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			return "闰年";
		}
		return "平年";
	}
}
