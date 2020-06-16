package ThreadsEpam06_2020;


import sun.security.krb5.internal.TGSRep;

import java.util.Scanner;
class Mthr extends Thread{
    Mthr(){
        System.out.println("Mthr created");
    }

    @Override
    public void run() {
        System.out.println("Mthr run");
    }
}

class MyThread implements Runnable {

    private boolean isActive;

    void disable(){
        isActive=false;
    }

    MyThread(){
        isActive = true;
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(isActive){
            System.out.println("Loop " + counter++);
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
public class Simplest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread();
        Mthr mthr=new Mthr();
        System.out.println("Created but not run");
        mthr.start();
        System.out.println("Started");
        System.out.println("mth is alive?: "+mthr.isAlive());
        mthr.wait();
        System.out.println("mth is alive?: "+mthr.isAlive());
        System.out.println("thread: "+thread.getName());
//        System.out.println("Main thread started...");
//        MyThread myThread = new MyThread();
//        new Thread(myThread, "MyThread").start();

//        while(true){
//
//            Scanner scan = new Scanner(System.in);
//            System.out.println("to stop type stop");
//            String name=scan.nextLine();
//            if (name.equals("stop")) {
//                myThread.disable();
//                break;
//            }
//

        }
    }
