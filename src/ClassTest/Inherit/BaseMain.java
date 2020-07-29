package ClassTest.Inherit;

public class BaseMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.foo();
        Base base = child;
        base.foo();
        child.setName("ssssss");
        System.out.println("child.name :" + child.name);
        System.out.println("base.name : " + base.name);
        Object o = new Object();

    }
}
