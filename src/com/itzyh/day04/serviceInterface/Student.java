package com.itzyh.day04.serviceInterface;

import com.itzyh.day04.bean.People;
import com.itzyh.day04.serviceInterface.impl.Consumer;

/**
 * 继承People类实现Consumer接口
 * @author 38198
 *
 */
public class Student extends People implements Consumer {

	String school;

	public Student(String pName, int pAge, String pSex, String school) {
		super(pName, pAge, pSex);
		this.school = school;
	}

	@Override
	public void useCreate() {
		// TODO Auto-generated method stub

		
	}

	public void study() {
		System.out.println("该学生"+getpName()+"在"+this.school+"学习");
	}
}
