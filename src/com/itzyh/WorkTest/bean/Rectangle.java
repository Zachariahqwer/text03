package com.itzyh.WorkTest.bean;

/**
 * 矩形类，继承与图形类
 * @author 38198
 *
 */
public class Rectangle extends Shape {
	
	private double width;
	private double height;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rectangle(double width,double height,String color) {
		super();
		this.width = width;
		this.height = height;
		setColor(color);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = this.width * this.height;
		return area;
	}

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		double per = (this.width + this.height) * 2;
		return per;
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		System.out.println("矩形的颜色为："+getColor()+"，长为："+width+"，宽为："+height+"\n"+"面积为："+getArea()+"，周长为："+getPer());
		
	}

}
