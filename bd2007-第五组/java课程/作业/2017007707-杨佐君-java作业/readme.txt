дһ���߳���NumThread,run�����������δ�ӡ1��100�����֣�ÿ��ӡһ�ξ�����һ�£�����ʱ�����0��2000����֮��
���Է����д�������������̶߳������Ҫʵ������Ч������run�����и����ȥ��д 
t1��t2�����̶߳��󣬵���start��������֮��˭�ȴ�ӡ��100��������˭��ֹͣ��ֹͣ��ʱ��ҲҪ����һ���߳�Ҳ��������
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



