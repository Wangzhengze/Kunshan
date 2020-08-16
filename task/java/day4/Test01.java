package com.briup.day03;

public class Test01 {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*11);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
