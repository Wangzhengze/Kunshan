package com.briup.day03;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("各个位数的和为："+sum);
	}

}
