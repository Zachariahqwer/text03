package com.itzyh.day05;

import java.util.HashMap;

/**
 * 第10章 课后作业 创建HashMap对象，存储银行储户信息，测试类
 * @author 38198
 *
 */
public class Test04 {

	public static void main(String[] args) {
		
		hashMap();
	}
	
	public static void hashMap() {
		
//		HashMap<Object, Object> hm = new HashMap<>();
//		
//		hm.put("id", 222);
//		hm.put("name", "Lisa");
//		hm.put("money", 30000.0);
//		System.out.println(hm);
		
		HashMap<Integer, User> users = new HashMap<>();
		User user1 = new User(1,"Lisa",300.0);
		User user2 = new User(2,"kxe",600.0);
		User user3 = new User(3,"zyh",800.0);
		
		
		users.put(user1.getId(), user1);
		users.put(user2.getId(), user2);
		users.put(user3.getId(), user3);
		System.out.println(users.get(2));
	}
}
