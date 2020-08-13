package ThreadsEpam06_2020;



public class ThreadsJoiWaitTest {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 done");
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 done");
            }

        };
        t2.start();


        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main done");
    }

}
