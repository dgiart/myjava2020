package ClassTest;

import java.util.Objects;

interface A {
    void a();
    void b();
    void c();
    void d();
    void e();
    void show();
}
abstract class B implements A { //1
    public void a() {
        System.out.print("a");
    }
    public void d() {
        System.out.print("d");
    }
}
abstract class C extends B {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return x == c.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

    int x;//=10;
    public void b() {
        System.out.print("b");
    }
    public void c() {
        System.out.print("c");
    }
    public void d() {
        System.out.print("D");
    }
    public void show(){
        System.out.println("\n x="+x);
    }

}
    public class InterfTest{
        public static void main(String[] args) {
            A c = new C()
            { //2
                public void show(){
                    System.out.println("\n x="+x);
                }
//                int x=222;

                public void b() {
                    System.out.print("B");
                }
                public void e() {
                    System.out.print("e");
//                  this.x=111;
                }

            };
            c.a();
            c.b();
            c.c();
            c.d();
            c.e();
            c.show();
            Integer x=10;
            System.out.println(x.getClass().getName());
            System.out.println(x.getClass().getSimpleName());
            System.out.println(x.getClass());
            System.out.println(x.toString());

        }
    }

