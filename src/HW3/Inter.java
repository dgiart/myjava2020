package HW3;

public interface Inter {
    default void foo(){
        System.out.println("interfase");
    }
    static void foo2(){
        System.out.println("Static INTER");
    }
}
