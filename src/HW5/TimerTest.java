package HW5;

public class TimerTest {
    public static void main(String[] args) throws InterruptedException {
        double start = System.nanoTime();
        Thread.sleep(3,500000);

        System.out.println(System.nanoTime() - start);
    }
}
