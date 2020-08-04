package HW5;

class ThreadRun implements Runnable{
    private String name;
    void start(){
        this.run();
    }
    @Override
    public void run() {
        if(Thread.interrupted()) return;;
        while (!Thread.interrupted()){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(333,333);
            } catch (InterruptedException e) {
                return;
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
public class StopTest extends Thread{
    @Override
    public void run() {
        double start = System.currentTimeMillis();
        while ((System.currentTimeMillis() - start) < 5000 && !isInterrupted()){

        }
        if(!isInterrupted()) {
            System.out.println("DONE, time = " + (System.currentTimeMillis() - start));
        }
    }

    public static void main(String[] args) {
        Thread thread = new StopTest();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        thread.interrupt();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.isInterrupted());
        System.out.println(thread.isAlive());
        System.out.println("Main finished");

    }
}
