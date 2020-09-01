package com.itzyh.day01;

import java.util.Random;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.And;

public class HelloWorld {
	/**
	 * 主程序的函数入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println("HlloWord!");
		// ctrl 加 m 全框、缩框
		FirstSum();
		
		System.out.println("《登鹳雀楼》");
		System.out.println("作者：王之涣");
		System.out.println("白日依山尽，黄河入海流。");
		System.out.println("欲穷千里目，更上一层楼。");
		
		int x = 1,y = 2,z =3;
		int x1 = x>y ? x:y;
		System.out.println("x与y中数大的是：" +  x1);
		
		System.out.println(y+=z--/++x);
		
		System.out.println(z);
		
		
		int i = 5,j = 10;
		System.out.println(i<j);
		System.out.println(i>=j);
		
		int a = 10,b = 20;
		int temp = 0;
		System.out.println("交换前：a = "+a+"，b = "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("交换后：a = "+ a + "，b = "+b);
		
		// 课后作业2
//		Test02();
		
		// 课后作业3
//		Test03();
		
//		Test04();
		
//		Test_3_01();

//		Test_3_02();
		Test_3_03();
		
	}

	public static void FirstSum() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	/**
	 *  第二章课后作业 2，求三位整数个位、十位、百位相加的和
	 */
	public static void Test02(){
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("请输出三位整数：");
		int num = sc.nextInt();
		int ge = num % 10;
		int bai = num / 100;
		int shi = num % 100 /10;
		int sum = bai + shi + ge;
		
		System.out.println("三位数num="+num+", 和sum = "+sum);
		
	}
	
	/**
	 * 第二章课后作业 3，华氏温度和摄氏温度转换
	 */
	public static void Test03() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输出华氏温度：");
		Double Htmp = scanner.nextDouble();
		Double Stmp = (Htmp-32)*5/9;
		Htmp = Stmp*9/5+32;
		
		System.out.println("摄氏温度：Stmp = "+Stmp+"，华氏温度：Htmp = "+Htmp);
	}

	/**
	 * 第二章课后作业 4，转换大写字母
	 */
	public static void Test04() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String line = scanner.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<line.length();i++) {
			char c  = line.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			}
		}
		System.out.println(sb);
	}
	
	/**
	 * 第三章，课堂练习   判断2064是不是闰年
	 */
	public static void Test_3_01() {
		
		int year = 2064;
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
			System.out.println("该年为闰年");
		}else {
			System.out.println("不是闰年");
		}
	}
	
	/**
	 * 第三章，课堂练习   
	 */
	public static void Test_3_02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("该月份为31天");
			break;
		case 2:
			System.out.println("该月份天数为28天");
			break;
		case 4:
		case 6:
		case 9:
			System.out.println("该月份天数为30天");
			break;
		default:
			System.err.println("错误的月份");
			Test_3_02();
			break;
		}
	}
	
	/**
	 * 第三章，课堂练习   输出该日是本年的第多少天
	 */
	public static void Test_3_03() {
		
		Random r1 = new Random();
		System.out.println("生成随机月份");
		int month = r1.nextInt(12);
		Random r2 = new Random();
		System.out.println("生成随机天数");
		int day = r2.nextInt(30);
		System.out.println(month+"月"+day+"日");
		int days = 0;
		switch(month) {
		case 12:
			days += 30;
		case 11:
			days += 31;
		case 10:
			days += 30;
		case 9:
			days += 31;
		case 8:
			days += 30;
		case 7:
			days += 30;
		case 6:
			days += 31;
		case 5:
			days += 30;
		case 4:
			days += 31;
		case 3:
			days += 30;
		case 2:
			days += 28;
		case 1:
			days += day;
		}
		if (days>365 || month == 0 || day == 0) {
			System.err.println("超出天数，或者随机月份、天数错误");
		}else {
			System.out.println("第"+days+"天");
		}
	}
}
