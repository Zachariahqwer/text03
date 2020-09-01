package com.itzyh.WorkTest.service;

import java.util.Scanner;

import com.itzyh.WorkTest.service.impl.IFruilt;

/**
 * 
 * @author 38198
 *
 */
public class Gardener {

	public IFruilt create() {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		IFruilt fruilt = null;
		switch (name) {
		case "苹果":
			fruilt = new AppleImpl();
			break;
		case "香蕉":
			fruilt = new BananaImpl();
			break;
		case "葡萄":
			fruilt = new GrapesImpl();
			break;
			default:
				System.err.println("请输入水果");
				break;
		}
		s.close();
		return fruilt;
	}
	
}
