package com.briup.day5;

public class DaemonTest {
    public static void main(String[] args) {
       Thread t1 =  new Thread("线程1"){
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    System.out.println(getName()+":"+i);
                }
            }
        };

        Thread t2 = new Thread("线程2") {
            @Override
            public void run() {
                for(int i=0;i<50;i++){
                    System.out.println(getName()+":"+i);
                }
            }
        };
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
