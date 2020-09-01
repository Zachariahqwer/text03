package com.itzyh.WorkTest.bean;

/**
 * 定义圆类继承与图形类
 * @author 38198
 *
 */
public class Circle extends Shape {
	
	static double PI = 3.14;
	private double radius;
	
	public Circle(double radius,String color) {
		// TODO Auto-generated constructor stub
		super();
		this.radius = radius;
		setColor(color);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = this.radius * this.radius * PI;
		return area;
	}

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		double per = 2*PI*radius;
		return per;
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub

		System.out.println("圆的颜色为："+getColor()+"，半径为："+this.radius+"\n"+"面积："+getArea()+"，周长："+getPer());
	}

}
