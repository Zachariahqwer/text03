package com.itzyh.day04.bean;

/**
 * 第六章 课后作业 定义一个汽车类
 * @author 38198
 *
 */
public class Vechicle {

	private String brand;
	private String color;
	private double speed;
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Vechicle() {
		
	}

	public Vechicle(String brand, String color, double speed) {
		super();
		this.brand = brand;
		this.color = color;
		this.speed = 0;
	}
	
	public void run() {
		System.out.println("汽车奔跑");
	}
	
}
