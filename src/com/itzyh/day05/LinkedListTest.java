package com.itzyh.day05;

import java.util.LinkedList;

/**
 * 第10章 课后作业 1，验证队列
 * @author 38198
 *
 */
public class LinkedListTest {

	private LinkedList<Object> lk = new LinkedList<>();
	
	public void put(Object o) {
		lk.addLast(o);
	}
	
	public Object get() {
		return lk.removeLast();
	}
	
	public boolean isEmpty() {
		boolean b = true;
		if (lk.size()>0) {
			b = false;
		}
		return b;
	}
	
	public void show() {
		System.out.println(lk);
	}
}
