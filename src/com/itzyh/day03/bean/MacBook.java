package com.itzyh.day03.bean;

/**
 * 第六章  课后作业3
 * @author 38198
 *
 */
public class MacBook {

	private char color;
	private int cpu;
	public MacBook(char color, int cpu) {
		super();
		this.color = color;
		this.cpu = cpu;
	}
	public MacBook() {
		super();
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	
	
}
