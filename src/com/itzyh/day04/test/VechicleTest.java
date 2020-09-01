package com.itzyh.day04.test;

import com.itzyh.day04.bean.Car;
import com.itzyh.day04.bean.Vechicle;

public class VechicleTest {

	public static void main(String[] args) {
		
		Vechicle ve = new Vechicle("benz", "black", 0);
		ve.run();
		
		ve = new Car("Honda", "red", 0, 2);
		ve.run();
	
	}
}
