package ThreadsEpam06_2020;

import java.util.concurrent.TimeUnit;

public class DemoThread {
    public static void main(String[] args) {
        FirstThread firstThread=new FirstThread();
        firstThread.start();
//        firstThread.
//        new Object().
        Thread talk=new Thread(new TalkThread());
        talk.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println("IN MAIN "+i);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
