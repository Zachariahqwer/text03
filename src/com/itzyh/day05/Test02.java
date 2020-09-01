package com.itzyh.day05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 课后作业 2 遍历顺序列表ArrayList
 * @author 38198
 *
 */
public class Test02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		while(list.size()<5) {
			int num = (int)(Math.random()*5+1);
			list.add(num);
		}
		System.out.println(list);

		for(Integer i:list) {
			System.out.println(i);
		}
		
	}
}
