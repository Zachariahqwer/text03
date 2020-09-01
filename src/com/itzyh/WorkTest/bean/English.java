package com.itzyh.WorkTest.bean;

/**
 * 英语系继承学生类
 * @author 38198
 *
 */
public class English extends Student {

	public English(String sId, String sName, char sSex,int sAge,double speechScore,double middleScore,double finalScore ) {
		super(sId, sName, sSex, sAge, (0.5*speechScore+0.25*middleScore+0.25*finalScore));
		// TODO Auto-generated constructor stub
	}

	
}
