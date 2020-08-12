package HW5;

public class ThreadOnFly {
    final static int M = 5;
    static Thread[] x = new Thread[M];
    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < M; i++) {
            x[i] = new Thread(){
                synchronized public void  run(){

                    {
                        System.out.println(Thread.currentThread().getName() + " STARTED");
                        try {
                            sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " FINISHED");
                    }
                }
            };
            x[i].start();
        }
        for (int i = 0; i < M; i++){
            try {
                x[i].join();
                System.out.println(x[i].getName() + "joined");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.nanoTime();
        System.out.println("MAIN FINISHED with T = " + (end - start));

    }
}
