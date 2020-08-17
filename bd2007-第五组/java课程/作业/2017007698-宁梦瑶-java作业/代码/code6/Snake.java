package com.briup.day2;

public class Snake extends Animal {
    public Snake(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("蛇吃田鼠");
    }

    @Override
    public void walk() {
        System.out.println("蛇是爬行动物");
    }
}
