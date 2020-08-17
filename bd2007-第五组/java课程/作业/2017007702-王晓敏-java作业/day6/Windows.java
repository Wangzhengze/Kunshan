package com.briup.day06;

public class Windows {
	private String size;
	private String color;
	private String style;
	
	public Windows(String size, String color, String style) {
		this.size = size;
		this.color = color;
		this.style = style;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	@Override
	public String toString() {
		return "Windows [size=" + size + ", color=" + color + ", style=" + style + "]";
	}
	
	
	
	
	

}
