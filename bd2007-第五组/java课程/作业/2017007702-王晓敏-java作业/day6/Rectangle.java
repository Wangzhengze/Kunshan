package com.briup.day06;

public class Rectangle extends Shape {
	double height;
	double width;
	public Rectangle() {
		height = 1.0;
		width = 1.0;
	}
	
	public Rectangle(double width,double height) {
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(int x,int y,double width,double height) {
		this.x=x;
		this.y=y;
		this.height=height;
		this.width = width;
	}
   public void draw() {
	   System.out.println("draw in rectangle");
	   System.out.println("x:"+x+"y:"+y+"width:"+width+"height:"+height);
   }
}






