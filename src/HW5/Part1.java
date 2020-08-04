package HW5;

public class Part1 {
    static class ThreadThread extends Thread{
        @Override
        public void run() {
            while (!isInterrupted()){
                System.out.println(Thread.currentThread().getName());
                try {
                    sleep(333,333);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
    static class ThreadRun implements Runnable{
        private String name;
        void start(){
            this.run();
        }
        @Override
        public void run() {
            while (!Thread.interrupted()){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(333,333);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
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
    public static void main(String[] args){
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
        Thread thread1 = new Thread(new ThreadThread());
        thread1.setName("ThreadThread");
        thread1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        thread1.interrupt();
        Thread thread2 = new Thread(new ThreadRun());
        thread2.setName("RunThread");
        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        thread2.interrupt();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}