package ClassTest;

public class ImmuteMaine {
    public static void main(String[] args) {
        Immuteble immuteble1=new Immuteble();
        Immuteble immuteble2=new Immuteble(100,"immute 2");

        System.out.println("imm1 name: "+ immuteble1.getName());
        System.out.println("imm2 name: "+ immuteble2.getName());

        Double i=1.37e+25;
        System.out.println(i*123);

    }
}
