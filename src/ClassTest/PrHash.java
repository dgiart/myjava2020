package ClassTest;
import java.util.Objects;
import java.util.Random;

class Aa {
    int a;
    Aa(int a) {
        this.a = a;
    }
}
public class PrHash {
    int id;
    String name;
    @Override
    public String toString() {
        return "id:"+id+", name: "+name+", M="+M;
    }

    static int i;
    final int M;
    static int N;
    {
        M=new Random().nextInt(1000);
    }
    PrHash(){
//        M=1000;
    }

    public PrHash(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Aa a1 = new Aa(1);
        Aa a2 = new Aa(1);
        System.out.print(a1 == a2);
        System.out.print(", " + a1.equals(a2));
        System.out.print(", " + Objects.equals(a1, a2));
        System.out.print(", " + Objects.deepEquals(a1, a2));
        TestFromBase tfb=new TestFromBase();
        tfb.x=Integer.parseInt("1000");
        tfb.showx();
        System.out.println("***");
        System.out.println("i="+i);

        PrHash p=new PrHash(1,"Art");
        PrHash p0=new PrHash();
        PrHash p1=new PrHash();

        System.out.println(p0.M);
        System.out.println(p1.M);
        System.out.println("N="+N);
        System.out.println(p.toString());




    }
}