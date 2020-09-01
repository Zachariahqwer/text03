package com.itzyh.WorkTest.test;

import com.itzyh.WorkTest.bean.Circle;
import com.itzyh.WorkTest.bean.Rectangle;
import com.itzyh.WorkTest.bean.Shape;

/**
 * 测试类
 * @author 38198
 *
 */
public class ShapeTest {

	public static void main(String[] args) {
		Shape s = new Rectangle(2,2,"蓝色");
		s.showAll();
		
		s = new Circle(2.0, "绿色");
		s.showAll();
		
	}
}
