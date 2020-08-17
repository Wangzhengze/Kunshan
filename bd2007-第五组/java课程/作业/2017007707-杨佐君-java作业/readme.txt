写一个线程类NumThread,run方法中日依次打印1到100的数字，每打印一次就休眠一下，休眠时间随机0到2000毫秒之间
测试方法中创建该类的俩个线程对象，如果要实现以下效果，则run方法中该如何去编写 
t1和t2俩个线程对象，调用start方法开启之后，谁先打印完100个数字则谁先停止，停止的时候也要让另一个线程也结束运行
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



