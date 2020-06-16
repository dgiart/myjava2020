package ThreadsEpam06_2020;

import java.util.concurrent.TimeUnit;

public class FirstThread extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("Running FIRST"+i);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
