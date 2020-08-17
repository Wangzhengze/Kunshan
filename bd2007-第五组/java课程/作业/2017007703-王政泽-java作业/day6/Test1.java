package com.briup.day06;

public class Test1 {
	public static void main(String[] args) {
		Windows w1 = new Windows("80*90","黑色","推拉式");
		Windows w2 = new Windows("90*100","白色","双开门");
		Bedroom b = new Bedroom();
		Windows[] window = b.window;
		window[0] = w1;
		window[1] = w2;
		
		for(int i=0;i<window.length;i++) {
			System.out.println(window[i]);
		}
	}

}
