package ThreadsEpam06_2020;
class MyThread3 extends Thread{
    public void run(int i) throws InterruptedException {
        System.out.println("name"+Thread.currentThread().getName());
        for (int j = 0; j <100 ; j++) {
            System.out.println(i*10);
            sleep(100);
        }
    }

    public void start(int i) throws InterruptedException {
        this.run(i);
    }
}

public class Daem {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 myThread33=new MyThread3();
        MyThread3 myThread333=new MyThread3();
        myThread33.start(1);
        myThread333.start(3);
    }
}
