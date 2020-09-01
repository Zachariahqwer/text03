package com.itzyh.WorkTest.bean;

/**
 * 第七章 课后作业1 创建一个球员类
 * @author 38198
 *
 */
public class Players {

	private static int count; // 创建一个对象，count加1;
	public Players() {
		// TODO Auto-generated constructor stub
	}
	
	public static Players create() {
		
		count = 1;
		Players players = null;
		while(count <= 11) {
			
			players = new Players();
			System.out.println("创建了"+count+"个对象");
			count++;
		}
		System.out.println("对不起，已经创建了"+(count-1)+"个对象，不能在创建对象了");
		return players;
	}
	
	
//	private static int num = 11; // 最多创建11个对象
	
//	private String pName;
//	private int pAge;
//	private String pSex;
//	
//	public static int getCount() {
//		return count;
//	}
//
//	public static void setCount(int count) {
//		Players.count = count;
//	}
//
//	public static int getNum() {
//		return num;
//	}
//
//	public static void setNum(int num) {
//		Players.num = num;
//	}
//
//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	public int getpAge() {
//		return pAge;
//	}
//
//	public void setpAge(int pAge) {
//		this.pAge = pAge;
//	}
//
//	public String getpSex() {
//		return pSex;
//	}
//
//	public void setpSex(String pSex) {
//		this.pSex = pSex;
//	}
//
//	// 无参构造方法
//	public Players() {
//		count++;
//	}
//
//	// 带参构造
//	public Players(String pName, int pAge, String pSex) {
//		super();
//		this.pName = pName;
//		this.pAge = pAge;
//		this.pSex = pSex;
//		count++;
//	}
//	
//	// 无参    创建对象
//	public static Players createNewPlayer() {
//		// count<num时，可以创建对象
//		if(count < num) {
//			return new Players();
//		}else {
//			return null;
//		}
//	}
//	// 带参   创建对象
//	public static Players createNewPlayer(String pName,int pAge,String pSex) {
//		if(count < num) {
//			return new Players(pName,pAge,pSex);
//		}else {
//			return null;
//		}
//	}
	
}
