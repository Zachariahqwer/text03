package com.itzyh.day03.bean;

import java.sql.Array;

public class Student {

	private String sName;
	private int SId;
	private double score;
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getSId() {
		return SId;
	}
	public void setSId(int sId) {
		SId = sId;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student(String sName, int sId, double score) {
		super();
		this.sName = sName;
		SId = sId;
		this.score = score;
	}
	
	/**
	 * 给录入的学生按照分数排序 
	 * @param stu
	 */
	public static void sort(Student[] stu) {
		Student temp;
		for(int i=0;i<stu.length;i++) {
			for(int j=0;j<stu.length-1;j++) {
				if(stu[j].score<stu[j+1].score) {
					temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 显示学生信息
	 */
	public void show() {
		System.out.println("姓名："+sName+"，学号："+SId+"，分数："+score);
	}
	
}
