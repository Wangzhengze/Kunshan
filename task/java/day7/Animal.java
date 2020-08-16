package com.briup.day2;

public abstract class Animal {
    int legs;
    public Animal(int legs){
        this.legs = legs;
    }

    public abstract void eat();

    public abstract void walk();

}
