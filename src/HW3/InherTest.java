package HW3;

import java.util.Locale;

class A{
    int x = 1;
    static void  foo(){
        System.out.println("AAAA");
    }
}
class B extends A{
    int x = 2;
    static void  foo(){
        System.out.println("BBBB");
    }
}



public class InherTest {
    public static void main(String[] args) {
        Locale current = Locale.getDefault();
        System.out.println(current.getDisplayLanguage());

        A ab = new B();
        B bb = (B)ab;
        System.out.println(bb.x);
        ab.foo();
        bb.foo();
        A.foo();
        B.foo();
        System.out.println(bb instanceof A);
        System.out.println(bb instanceof B);
//        Object
    }
}
