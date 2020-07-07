package ClassTest;

class Abase{
    void foo(){
        System.out.println("Empty A");
    }
}
class Bsub extends Abase {
    void foo(int x){
        System.out.println("int B x="+x);
    }
}

class Csub extends Bsub {
    void foo(String s){
        System.out.println("String C " +s);
    }
}

public class InherTest {
    public static void main(String[] args) {
        Abase a=new Abase();
        Abase ab=new Bsub();
        a.foo();
        Bsub b=new Bsub();
        b.foo(10);
        Csub c=new Csub();
        c.foo("sssss");
    }
}
