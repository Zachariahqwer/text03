package com.itzyh.day03.test;

import java.util.Scanner;

import javax.net.ssl.SSLException;

import com.itzyh.day03.bean.Point;

public class PointTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("P1请输入x，y移动的数量：");
		int x = sc.nextInt();
		int y = sc.nextInt();
		movePointP1(x,y);
		System.out.println("P2请输入x，y移动的数量：");
		int i = sc.nextInt();
		int j = sc.nextInt();
		movePointP2(i,j);
		
		
	}
	
	
	public static void movePointP1(int dx,int dy) {
		
		Point po1 = new Point(1,2);
		po1.setX(dx + po1.getX());
		po1.setY(dy + po1.getY());
		
		System.out.println("p1的坐标：("+po1.getX()+","+po1.getY()+")");
	}
	public static void movePointP2(int dx,int dy) {
		
		Point po2 = new Point(2,3);
		po2.setX(dx + po2.getX());
		po2.setY(dy + po2.getY());

		System.out.println("p2的坐标：("+po2.getX()+","+po2.getY()+")");
	}
	
}
