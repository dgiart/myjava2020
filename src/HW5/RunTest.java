package HW5;

public class RunTest implements Runnable{
    @Override
    public void run() {
        while (!Thread.interrupted()){
            System.out.println("RUN");
            try {
                Thread.sleep(555);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("Try TO interrupt " + Thread.interrupted() + " " + Thread.currentThread().getName());
                return;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunTest());
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread.interrupt();
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Try TO interrupt in MAIN");
            e.printStackTrace();
        }
        System.out.println("main finished");
    }
}
