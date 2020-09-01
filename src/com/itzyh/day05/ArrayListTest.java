package com.itzyh.day05;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 使用set集合，生成1-25之内不重复的7个随机整数
 * @author 38198
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		HashSet<Integer> s = new HashSet<>();
		
		while(s.size()<7){
			int a = (int)(Math.random()*25+1);
			s.add(a);
		}
		System.out.println(s);
		
		System.out.println("---------foreach-----------");
		for (Integer integer : s) {
			System.out.println(integer);
		}
		System.out.println("----------迭代器-----------");
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
			if (next>15) {
				it.remove();
			}
		}
		System.out.println(s);
		System.out.println("----------------------------");
		System.out.println(Collections.max(s));
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(22);
		al.add(33);
		al.add(4);
		System.out.println("反转之前："+al);
		Collections.reverse(al);
		System.out.println("反转之后："+al);
		Collections.sort(al);
		System.out.println("排序："+al);
		

		
		sort();

	}
	
	/**
	 * Collections工具类，排序	
	 */
	public static void sort() {
		
		ArrayList<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一组整数");
		for(int i=1;i<=5;i++) {
			a.add(sc.nextInt());
		}
		System.out.println("排序之前："+a);
		Collections.sort(a);
		System.out.println("排序之后(升序)："+a);
		Collections.reverse(a);
		System.out.println("降序："+a);
		
	}
	
}
