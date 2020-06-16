package ThreadsEpam06_2020;

import java.util.concurrent.TimeUnit;

public class TalkThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println("Running  TALK"+i);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
