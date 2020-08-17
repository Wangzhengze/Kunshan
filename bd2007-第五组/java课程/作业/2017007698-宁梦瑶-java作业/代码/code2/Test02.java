package com.briup.day03;

public class Test02 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,5,6,7,8,9};
		int sum = 0;
		int avg = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg = sum/arr.length;
		System.out.println("平均值为："+avg);
	}
	
	
	
	
	
	
	
	

}
