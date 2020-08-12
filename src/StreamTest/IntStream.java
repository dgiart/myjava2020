package StreamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntStream {
    public static void main(String[] args) {
        int []l1 = new int[]{1,2,3};
        List<Integer> l = new ArrayList<Integer>();
        for (int i = -5; i < 5; i++) {
            l.add(i);
        }
        l.stream().filter(x -> { return x > 0;}).forEach(System.out::println);
        l.stream().filter(x -> x %2 == 0).forEach(System.out::println);
//        for (Integer x:
//             l) {
//            System.out.println(x);
//        }

    }
}
