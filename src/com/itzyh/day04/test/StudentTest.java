package com.itzyh.day04.test;

import com.itzyh.day04.serviceInterface.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student("徐艺洋", 22,"女", "创造营2020");
		st.study();
	}
}
