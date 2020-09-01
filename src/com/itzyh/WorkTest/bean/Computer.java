package com.itzyh.WorkTest.bean;

/**
 * 计算机系继承自学生类
 * @author 38198
 *
 */
public class Computer extends Student{

	public Computer(String sId, String sName, char sSex, int sAge,double operateScore,double writerScore,double middleScore, double finalScore) {
		super(sId, sName, sSex, sAge, (0.4*operateScore+0.2*writerScore+0.2*middleScore+0.2*finalScore));
		// TODO Auto-generated constructor stub
	}

}
