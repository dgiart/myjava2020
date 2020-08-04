package HW5;

public class ThreadOnFly {
    public static void main(String[] args) {
        Thread x = new Thread(){
            public void run(){
                System.out.println("!!!");
            }
        };
        x.start();

    }
}
