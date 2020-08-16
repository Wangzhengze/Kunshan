package com.briup.day06;

public class Circle extends Shape {
	double r;
	public Circle() {
		r=1.0;
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	public Circle(int x,int y,double r) {
		this.x =x;
		this.y = y;
		this.r = r;
	}
	
	public void draw() {
		System.out.println("draw in circle");
		System.out.println("x:"+x+"y:"+y+"r:"+r);
		
	}

}
