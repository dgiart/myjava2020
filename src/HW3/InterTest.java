package HW3;


class FromInt implements Inter{
    /**
     *
     */
//    @Override
//    public void foo(){
//        System.out.println("foo in CLASS");
//    }
    static void foo2(){
        System.out.println("static from class");
    }
}
public class InterTest {
    public static void main(String[] args) {
        FromInt f = new FromInt();
        f.foo();
        Inter i = new FromInt();
        i.foo();
    }
}
