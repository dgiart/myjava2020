package ClassTest;

import java.util.Optional;

class Az{}
public class AnonIntBasedMain {
    public static void main(String[] args) {
        AnonIntBased anonIntBased=(int x, int y)->(x*y);

        System.out.println(anonIntBased.act1(2,3));
    }
//    Optional
}
