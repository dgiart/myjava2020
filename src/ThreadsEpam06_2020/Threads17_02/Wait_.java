package ThreadsEpam06_2020.Threads17_02;

public class Wait_ {
    static Object ob;
    public static void main(String[] args) {
        MThread m=new MThread();
        Long start=System.currentTimeMillis();
        m.start();
//        try {
//            m.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        long t1=System.currentTimeMillis()-start;
        System.out.println("time="+t1+" mls");
        System.out.println("main done");
    }
}
class MThread extends Thread{
    @Override
    public synchronized void run() {
        try {
            wait(5);
//            Wait_.ob.wait(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads Finished Naturally");
    }
}