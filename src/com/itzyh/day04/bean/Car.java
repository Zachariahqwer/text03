package com.itzyh.day04.bean;

public class Car extends Vechicle {
	
	private int loader;
	
	public int getLoader() {
		return loader;
	}

	public Car(String brand, String color, double speed,int loader) {
		super(brand, color, speed);
		// TODO Auto-generated constructor stub
		this.loader = loader;
	}
	
	public void run() {
		System.out.println("轿车奔跑");
	}

	
}
