��һ���߳�������֮ǰ����Ϊ��̨�̣߳�setDaemon������,
�۲����úͲ����ö����н����������Ӱ�졣


���ۣ�ֻҪ������һ��ǰ̨�߳������У�������̾Ͳ��������
      �������һ������ֻ�к�̨�߳��ڹ�������ô������̾ͽ����ˡ�
package com.briup.day5;

public class Thread1 implements Runnable {

    @Override
    public void run() {

    }
}


package com.briup.day5;

public class DaemonTest {
    public static void main(String[] args) {
       Thread t1 =  new Thread("�߳�1"){
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    System.out.println(getName()+":"+i);
                }
            }
        };

        Thread t2 = new Thread("�߳�2") {
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

