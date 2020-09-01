package com.itzyh.day03.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.itzyh.day03.bean.Goods;

public class GoodsTest {
	
	public static void main(String[] args) {
		
		// Collection 集合接口，用iterator()方法来遍历
		Collection<Goods> c = new ArrayList<>();
		Goods g1 = new Goods("可乐",2.5);
		Goods g2 = new Goods("鼠标",50);
		c.add(g1);
		c.add(g2);
		
		// 遍历collection 集合对象的典型用法！
		Iterator<Goods> it = c.iterator();
		while(it.hasNext()) {
			Goods g = it.next();
			System.out.println(g.getgName()+":"+g.getgPrice());
		}
	}
}
