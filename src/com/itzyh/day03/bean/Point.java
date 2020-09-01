package com.itzyh.day03.bean;

import java.util.Scanner;

/**
 * 第六章 课后作业1
 * @author 38198
 *
 */
public class Point {

	private int x;
	private int y;
	
	public  Point() {
		
	}
	public Point(int x0,int y0) {
		this.x = x0;
		this.y = y0;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
//	public void movePoint(int dx,int dy) {
//		
////		Scanner sc = new Scanner(System.in);
////		System.out.println("请输入x，y移动的数量：");
////		int x = sc.nextInt();
////		int y = sc.nextInt();
//		this.x = dx + x;
//		this.y = dy + y;
//		
//		System.out.println("("+this.x+","+this.y+")");
//	}
	
}
