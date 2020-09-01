package com.itzyh.WorkTest.bean;

/**
 * 文学系继承自学生类
 * @author 38198
 *
 */
public class Chinese extends Student{

	public Chinese(String sId, String sName, char sSex,int sAge,double speechScore,double articleScore,double middleScore,double finalScore) {
		super(sId, sName, sSex, sAge, (0.35*speechScore+0.35*articleScore+0.15*middleScore+0.15*finalScore));
	}
}
