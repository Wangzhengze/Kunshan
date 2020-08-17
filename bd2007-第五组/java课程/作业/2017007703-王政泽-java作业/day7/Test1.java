package com.briup.day2;

public class Test1 {
    public static void main(String[] args) {
        Animal c = new Cat(4);
        c.eat();
        c.walk();

        Animal s = new Snake(0);
        s.eat();
        s.walk();
    }
}
