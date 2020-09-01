package com.itzyh.day03.test;

import com.itzyh.day03.bean.MacBook;

public class MacBookTest {

	public static void main(String[] args) {
		
		showMac();
	}
	
	public static void showMac() {
		
		MacBook mb = new MacBook('蓝',22);
		System.out.println("颜色："+mb.getColor()+"，型号："+mb.getCpu());
	}
}
