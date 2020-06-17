package ThreadsEpam06_2020.Threads17_02;

import java.util.concurrent.TimeUnit;

public class SimpleThread {

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("Start");
        Long start=System.currentTimeMillis();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long t1=System.currentTimeMillis()-start;
        System.out.println("3 sec="+t1+" mls");
        System.out.println("Before interruption: Is interrupt="+myThread.isInterrupted());
//        myThread.interrupt();
        myThread.interrupt();
        System.out.println("JUST after interruption: Is interrupt="+myThread.isInterrupted());
        System.out.println("JUST after interruption: Is alive="+myThread.isAlive());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3 SEC after interruption: is Alive="+myThread.isAlive());
        long t2=System.currentTimeMillis()-start;
        System.out.println("t2="+t2);


    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads Finished Naturally");
    }
}