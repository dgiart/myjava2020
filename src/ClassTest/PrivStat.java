package ClassTest;

interface Int{
    void a();
    void b();
}

abstract class Abs{
    int x=10;
    private static int i=111;
    final private static int j=111;
    void afoo(){
        System.out.println("Abs own method");
    }
    abstract void aafoo();

    static void setI(int ii){
        i=ii;
    }

    static int getI(){
        return i;
    }
}


class Sub1 extends Abs implements Int {
    public void a(){
        System.out.println("a inside Sub");
        System.out.println(this.x);
    }
    public void b(){
        System.out.println("b from Sub");
    }
    void aafoo(){
        System.out.println("afoo in Sub1");
    }
}


public class PrivStat {
    private static void foo(){
        System.out.println("Private Static");
       }
        static int xxx=999;
        static void f(){};

    public static void main(String[] args) {
//        foo();
        Abs a=new Sub1();
        a.afoo();
        a.aafoo();
        Int a1=new Sub1();
        System.out.println("a from Int");
        a1.a();
        Sub1 s=new Sub1();
        System.out.println("a from Sub1");
        s.a();
        System.out.println("a1 class name: "+a1.getClass().getSimpleName());
        System.out.println("a class name: "+a.getClass().getSimpleName());
        System.out.println("s class name: "+s.getClass().getSimpleName());
        Abs.setI(11100);
        System.out.println(Abs.getI());
        System.out.println(xxx);
        f();
    }
}
