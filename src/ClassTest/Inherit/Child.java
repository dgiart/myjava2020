package ClassTest.Inherit;

public class Child extends Base {
    public Child() {
        System.out.println("CHILD EMPTY");
    }

    public Child(int id, String name) {
        super(id, name);
    }
    public  void foo(){
        super.setName("lll");
        System.out.println("CHILD foo");
    }
}
