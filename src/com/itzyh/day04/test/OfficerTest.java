package com.itzyh.day04.test;

import com.itzyh.day04.bean.Officer;
import com.itzyh.day04.bean.Worker;

public class OfficerTest {

	public static void main(String[] args) {
		Officer officer = new Officer();
		Worker w = new Worker();
		officer.setSalary(1000.0);
		System.out.println(officer.getSalary());
		w.setSalary(2000.0);
		System.out.println(w.getSalary());
	}
}
