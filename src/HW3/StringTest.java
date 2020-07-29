package HW3;
import java.util.concurrent.TimeUnit;

public class StringTest {
    public static void main(String[] args) throws InterruptedException {
        long x = System.currentTimeMillis();
        String s = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <10000 ; i++) {
            s = s.concat("a");

        }
//        for (int i = 0; i <10000 ; i++) {
//            sb.append("a");
//        }
        long t = System.currentTimeMillis() - x;
        System.out.println(t);
//        System.out.println(s);
    }

}
