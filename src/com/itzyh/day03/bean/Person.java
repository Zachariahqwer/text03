package com.itzyh.day03.bean;

/**
 * 第六章 课后作业 4
 * @author 38198
 *
 */
public class Person {

	private String name;
	private double high;
	private double weight;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		super();
	}
	public Person(String name, int age,double high) {
		super();
		this.name = name;
		this.high = high;
		this.age = age;
	}
	public void sayHello(String name) {
		System.out.println("hello,my name is "+name);
	}
}
