package com.itzyh.day03.test;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

import com.itzyh.day03.bean.SanJiao;

import javafx.geometry.Side;

public class SanJiaoTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		SanJiao sj = new SanJiao(a,b,c);
		System.out.println(sj.getHigh());
		System.out.println("长："+sj.getWidth()+"宽："+sj.getLength()+"高："+sj.getHigh());
	}
}
