//public class MainOverloadTest {
//    public static void main(String[] args) {
//        A a = new B();
//        String n="jjjj";
//        a.method(n);
//    }
//}
//class A {
//    public void method(Object obj) {
//        System.out.println("A");
//    }
//}
//class B extends A {
////    @Override
//    public void method(String obj) {
//        System.out.println("B");
//    }
////
////    public void method(Integer obj) {
////        System.out.println("B");
////    }
//}
public class MainOverloadTest {
    public MainOverloadTest  () {
        System.out.println("DEFaULT");
    }
    public MainOverloadTest  (int i) {
        this (i, i);
        System.out.println("ONE int");
        }
    public MainOverloadTest  (int i, int j) {
        this ();
        System.out.println("TWO ints");
        }
    public static void main (String [] args) {
        MainOverloadTest  quest = new MainOverloadTest  (2,3); // 1
    }
}