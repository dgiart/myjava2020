package inteface.test;

interface Animal{
    void walk();
}
interface Predator extends Animal{
    void bite();
}
interface Kicker extends Animal{
    void kick();
}

class Lion implements Predator{

    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }

    @Override
    public void bite() {
        System.out.println("Lion is biting");
    }
}

class Elefant implements Kicker{

    @Override
    public void walk() {
        System.out.println("elefant is walkig");
    }

    @Override
    public void kick() {
        System.out.println("elefant is kickig");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        Animal l = new Lion();
        Animal e = new Elefant();
        l.walk();
        e.walk();
    }
}
