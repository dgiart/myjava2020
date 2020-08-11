package student;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> l= new ArrayList();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add(1,"XXX");
        System.out.println(l.get(1));
    }

}
