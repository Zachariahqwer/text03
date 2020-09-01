package com.itzyh.day03.test;

import com.itzyh.day03.bean.Person;

public class PersonCreate {

	public static void main(String[] args) {
		
		Person p1 = new Person("zhangsan",33,1.73);
		Person p2= new Person("lisi",44,1.74);
		
		p1.sayHello(p1.getName());
		p2.sayHello(p2.getName());
	}
}
