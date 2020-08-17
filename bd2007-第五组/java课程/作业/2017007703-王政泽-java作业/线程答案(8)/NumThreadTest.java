package com.briup.day5;

import java.util.Random;

public class NumThreadTest extends Thread {
    private static boolean flag;
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            System.out.println(getName()+":"+i);
            if(flag == true){
                System.exit(0);
            }
            Random random = new Random();
            try {
                sleep(random.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
    }

    public static void main(String[] args) {
        NumThreadTest t1 = new NumThreadTest();
        NumThreadTest t2 = new NumThreadTest();
        t1.start();
        t2.start();
    }
}
