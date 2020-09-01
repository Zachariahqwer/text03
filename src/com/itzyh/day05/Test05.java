package com.itzyh.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 第10章 课后作业 从控制台输入若干个单词，放入集合，排序后输出
 * @author 38198
 *
 */
public class Test05 {

	public static void main(String[] args) {
		getWord();
	}
	
	public static void getWord() {
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入若干个单词");
		while(list.size()<5) {
			
			String strword = sc.nextLine();
			// 将大写改成小写
			String word = strword.toLowerCase();
			list.add(word);
		}
		System.out.println("排序前："+list);
		Collections.sort(list);
		System.out.println("排序后："+list);
	}
}
