package ThreadsEpam06_2020.Threads17_02;

import java.util.concurrent.TimeUnit;

public class Sinkh {


    public static void main(String[] args) {
        Object o=new Object();
        Thr t1=new Thr(1,o);
        Thr t2=new Thr(1,o);
        Thr t3=new Thr(1,o);
        t1.start();
        t2.start();
        t3.start();
    }
}
class Thr extends Thread{
    long T;
    Object ob;
    Thr(long T,Object ob){
        this.T=T;
        this.ob=ob;
    }
    @Override
    public  void run() {
        synchronized(ob)
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am " + Thread.currentThread().getName() + ", #" + i + "-nd shoot");
                try {
                    TimeUnit.MILLISECONDS.sleep(this.T);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
//class CountThread implements Runnable{
//
//    CommonResource res;
//    CountThread(CommonResource res){
//        this.res=res;
//    }
//    public void run(){
//        synchronized(res){
//            res.x=1;
//            for (int i = 1; i < 5; i++){
//                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
//                res.x++;
//                try{
//                    Thread.sleep(100);
//                }
//                catch(InterruptedException e){}
//            }
//        }
//    }
//}