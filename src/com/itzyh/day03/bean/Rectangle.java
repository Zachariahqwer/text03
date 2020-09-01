package com.itzyh.day03.bean;

/**
 * 第六章  课后作业2
 * @author 38198
 *
 */
public class Rectangle {

	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public Rectangle(int width,int length) {
		if(width>0&&length>0) {
			this.width = width;
			this.length = length;
		}else {
			System.out.println("请输入正整数");
		}
	}
}
