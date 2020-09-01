package com.itzyh.WorkTest.bean;

/**
 * 第7章 课后作业3 shape图形类
 * @author 38198
 *
 */
public abstract class Shape {

	private double area;
	private double per;
	private String color;
	
	public Shape() {
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	// 计算面积
	public abstract double getArea();
	
	// 计算周长
	public abstract double getPer();
	
	// 输出所有信息
	public abstract void showAll();
	
	
}
