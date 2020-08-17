package com.briup.day06;

public class Door {
	private String size;
	private String color;
	private String material;
	public Door(String size, String color, String material) {
		super();
		this.size = size;
		this.color = color;
		this.material = material;
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
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Door [size=" + size + ", color=" + color + ", material=" + material + "]";
	}
	
	

}
