package com.itzyh.day03.bean;

/**
 * 第六章 课堂练习
 * @author 38198
 *
 */
public class SanJiao {

	private double length;
	private double width;
	private double high;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length>0) {
			this.length = length;
		}else {
			System.out.println("边长必须为正数");
		}
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width>0) {
			this.width = width;
		}else {
			System.out.println("边长必须为正数");
		}
		
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		if(high>0) {
			this.high = high;
		}else {
			System.out.println("边长必须为正数");
		}
		
	}
	public SanJiao() {
		
	}
	public SanJiao(double length,double width,double high) {
		
		if((length+width>high && length+high>width && width+high>length) && (length>0 &&width>0 && high>0)  ) {
			this.length = length;
			this.width = width;
			this.high = high;
		}else {
			System.out.println("不为三角形");
		}
	}
	
}
