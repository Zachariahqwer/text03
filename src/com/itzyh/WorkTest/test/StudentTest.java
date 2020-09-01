package com.itzyh.WorkTest.test;

import com.itzyh.WorkTest.bean.Chinese;
import com.itzyh.WorkTest.bean.Computer;
import com.itzyh.WorkTest.bean.English;
import com.itzyh.WorkTest.bean.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student[] stu = {
				new English("2", "徐艺洋", '女', 20, 90.0, 90.0, 98.0),
				new Computer("3", "刘些宁", '女', 22, 70, 80, 85, 90),
				new Chinese("4", "宋妍霏", '女', 23, 85, 90, 87, 90)	
		};
//		Student[] stu1 = new Student[stu.length];
//		for(int i = 0;i<stu1.length;i++) {
//			int num = (int)(Math.random()*stu.length);
//			while(stu[num] == null) {
//				num = (int)(Math.random()*stu.length);
//			}
//			stu1[i] = stu[num];
//			stu[num] = null;
//		}
//		for(int i = 0;i<stu1.length;i++) {
//			stu1[i].show();
//		}
		
		for(Student s:stu) {
			s.show();
		}
	}
}
