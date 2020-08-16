把一个线程在启动之前设置为后台线程（setDaemon方法）,
观察设置和不设置对运行结果所带来的影响。


结论：只要进程有一个前台线程在运行，这个进程就不会结束；
      但是如果一个进程只有后台线程在工作，那么这个进程就结束了。
package com.briup.day5;

public class Thread1 implements Runnable {

    @Override
    public void run() {

    }
}


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

