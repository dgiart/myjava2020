package ThreadsEpam06_2020;

import java.util.concurrent.TimeUnit;

public class FirstThread extends Thread{
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Running"+i);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
