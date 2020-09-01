package com.itzyh.day03.test;

import java.util.Scanner;

import com.itzyh.day03.bean.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长和宽：");
		int length = sc.nextInt();
		int width = sc.nextInt();
		showAll(width, length);
	}
	
	/**
	 * 求面积
	 */
	public static void getArea(int width, int length) {
		
		Rectangle rt = new Rectangle(width, length);
		int mianji = width * length;
		System.out.println("面积："+mianji);
	}
	/**
	 * 求周长
	 */
	public static void getPer(int width, int length) {
		Rectangle rt = new Rectangle(width, length);
		int zhouchang = (width+length)*2;
		System.out.println("周长："+zhouchang);
	}
	public static void showAll(int width, int length) {
		System.out.println("长："+length+"，宽："+width);
		getArea(width, length);
		getPer(width, length);
		
	}
}
