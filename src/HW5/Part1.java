package HW5;

import ThreadsEpam06_2020.TalkThread;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Part1 {
    static class ThreadThread extends Thread{
        @Override
        public void interrupt() {
            super.interrupt();
            System.out.println("THREAD was INTERRUPTED");
        }

        @Override
        public void run() {
            for (int i = 0; i < 4 ; i++){
                System.out.println(getName());
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
static class ThreadRun implements Runnable{
        private String name;
        void start(ThreadThread th){
            this.run();
            System.out.println("!!!");
        }
    @Override
    public void run() {
        for (int i = 0; i < 4 ; i++){
            System.out.println(getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        ThreadThread thread1 = new ThreadThread();
//        thread1.setName("ThreadThread");
//        thread1.start();
//        Thread.sleep(2000);
//        ThreadRun thread2 = new ThreadRun();
//        thread2.setName("RunThread");
//        thread2.start(thread1);
//        Thread t = new ThreadThread();
//        t.setName("TTTTT");
//        t.start();
        ExecutorService service= Executors.newSingleThreadExecutor();
        ThreadRun exec = new ThreadRun();
        exec.setName("EXECUTIN");
        Future future= service.submit(exec);
        future.get();
        service.shutdownNow();



    }
}
