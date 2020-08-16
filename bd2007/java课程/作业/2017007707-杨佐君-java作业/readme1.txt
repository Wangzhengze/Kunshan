线程对象有一个final方法:
public final void setPriority(int newPriority)
可以用来设置线程的优先级（最大优先级是10 最小是1 默认是5）

设计一个实验，来测试优先级对线程的执行带来的影响，同时得出你的结论.
package com.briup.day5;

public class PropTest {
    public final void setPriority(int newPriority) {
        Thread t1 = new Thread("线程1"){
            @Override
            public void run() {
                for (int i = 0;i<50;i++){
                    System.out.println(getName()+":"+i);
                }
            }
        };

        Thread t2 = new Thread("线程2") {
            @Override
            public void run() {
               for (int i=0;i<50;i++){
                   System.out.println(getName()+":"+i);
               }
            }
        };
        t1.start();
        t2.start();
        t1.setPriority(Thread.MAX_PRIORITY);
    }

    public static void main(String[] args) {
        PropTest t = new PropTest();
        t.setPriority(Thread.MIN_PRIORITY);
    }
}

