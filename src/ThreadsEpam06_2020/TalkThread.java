package ThreadsEpam06_2020;

import java.util.concurrent.TimeUnit;

public class TalkThread implements Runnable{
    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Running  TALK"+i);
            sb.append("Running  TALK"+i);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return;
    }
}
