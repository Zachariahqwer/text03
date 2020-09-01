package com.itzyh.day03.test;

import java.util.Scanner;

import com.itzyh.day03.bean.Student;


public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入录入学生的个数：");
		int numStudent = sc.nextInt();
		// 实例化学生对象的数组
		Student[] students = new Student[numStudent];
 		
 		// 录入学生信息
 		System.out.println("请录入学生信息：");
 		for(int i=0;i<students.length;i++) {
 			System.out.println("依次输入第"+(i+1)+"个学生信息");
 			students[i] = new Student(sc.next(),sc.nextInt(), sc.nextDouble());
 		}
		
 		// 调用排序方法
 		Student.sort(students);
 		System.out.println("-------------------------------------------");
 		for(Student s1:students) {
 			s1.show();
 		}
	}
}
