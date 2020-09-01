package com.itzyh.WorkTest.test;

import com.itzyh.WorkTest.bean.Players;

public class PlayersTest {

	public static void main(String[] agrs) {
		
//		while(true) {
//			Players player = Players.createNewPlayer();
//			if (player == null) {
//				System.out.println("对不起，已经创建了"+Players.getNum()+"个球员");
//				break;
//			}else {
//				System.out.println("创建了"+Players.getCount()+"个球员");
//			}
//		}
		
		Players.create();
	}
}
