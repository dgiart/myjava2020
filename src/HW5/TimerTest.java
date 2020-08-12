package HW5;

public class TimerTest {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(3000);
        long start = System.nanoTime();
        Thread.sleep(0,3140);

        System.out.println(System.nanoTime() - start);
    }
}
