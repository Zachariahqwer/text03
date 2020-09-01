package com.itzyh.day05;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 课后作业3 列表存储元素
 * @author 38198
 *
 */
public class Test03 {

	public static void main(String[] args) {
		
		ArrayList<String> hs = new ArrayList<>();
		hs.add("apple");
		hs.add("grape");
		hs.add("banana");
		hs.add("pear");
		
		System.out.println("最大的元素："+Collections.max(hs)+"\n"+"最小的元素："+Collections.min(hs));
		// 排序
		System.out.println("排序前："+hs);
		Collections.sort(hs);
		System.out.println("排序后："+hs);
	}
}
