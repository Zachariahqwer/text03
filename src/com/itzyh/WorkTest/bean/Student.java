package com.itzyh.WorkTest.bean;

/**
 * 第七章 课后作业 学生类
 * @author 38198
 *
 */
public class Student {

	private String sId;
	private String sName;
	private char sSex;
	private int sAge;
	private double score;
	
	public Student(String sId, String sName, char sSex, int sAge, double score) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.score = score;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public char getsSex() {
		return sSex;
	}

	public void setsSex(char sSex) {
		this.sSex = sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public void show() {
		System.out.println("学号："+this.sId+"，姓名："+this.sName+"，性别："+this.sAge+"，综合成绩："+this.score);
	}
	
}
