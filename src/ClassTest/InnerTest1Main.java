package ClassTest;

public class InnerTest1Main {
    public static void main(String[] args) {
//        InnerTest1.Adr adr=InnerTest1.new InnerTest1.Adr("LA","Lenina",10);
        InnerTest1.Adr adr=new InnerTest1().new Adr("LA","Lenina",10);
        adr.showId();
        InnerTest1 pers=new InnerTest1(11,"Bob",adr);
        System.out.println("adr: "+pers.getAdr());
        System.out.println(pers);
//        adr.
//        adr.setCity("LA");
//        adr.setStreet("Lenina");
//        adr.setHome(111);
//        System.out.println(adr);
    }
}
