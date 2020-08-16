package com.briup.day2;

public class Cat extends Animal {
    public Cat(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void walk() {
        System.out.println("猫有四条腿");
    }
}
