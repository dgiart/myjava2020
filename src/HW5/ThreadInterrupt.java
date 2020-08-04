package HW5;

class ThreadTread extends Thread{
    @Override
    public void run() {
        while (!Thread.interrupted()){
            System.out.println("RUN");
            try {
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Try TO interrupt");
                interrupt();
            }
        }
    }
}
public class ThreadInterrupt {
    public static void main(String[] args) {
        Thread thread = new ThreadTread();
        thread.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("is interrupted: " + thread.isInterrupted());
        System.out.println("is alive1: " + thread.isAlive());
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("is alive2: " + thread.isAlive());
        System.out.println("main finish");

    }
}
