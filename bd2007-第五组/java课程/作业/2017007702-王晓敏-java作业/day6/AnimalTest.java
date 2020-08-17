package com.briup.day06;

public class AnimalTest {
	public static void main(String[] args) {
		Animal c = new Cat("猫");
		c.eat();
		Animal d = new Dog("狗");
		d.eat();
	}

}

class Animal {
	String name;
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		
	}
}

class Cat extends Animal {
	
	public Cat(String name) {
		this.name = name;
	}
	@Override
	public void eat() {
		System.out.println(name+"吃鱼");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		this.name = name;
	}
	@Override
	public void eat() {
		System.out.println(name+"吃肉");
	}
}













