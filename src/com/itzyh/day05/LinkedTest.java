package com.itzyh.day05;

/**
 * 测试队列先进先出
 * @author 38198
 *
 */
public class LinkedTest {

	public static void main(String[] args) {
		
		LinkedListTest listTest = new LinkedListTest();
		listTest.put("张运浩");
		listTest.put("徐艺洋");
		listTest.put("刘些宁");
		listTest.put("宋妍霏");
		listTest.show();
		
		boolean b = listTest.isEmpty();
		System.out.println("是否为空："+b);
		listTest.get();
		b = listTest.isEmpty();
		System.out.println("是否为空："+b);
		listTest.show();
	}
}
