package epam06_20;

public class TrebleClef {
    public static void main(String[] args) {

        String s="\uD834\uDD1E";
        System.out.println(s);
        System.out.println("DD1E="+0xDD1E);
        System.out.println("uDD1E= "+ "\uDD1E");
        System.out.println("uD834= "+ "\uD834");
        System.out.println("56606= "+ "\56606");
        System.out.println("**********************************************");
        for (int i = 0; i <100 ; i++) {
            System.out.println();
        }
//        char ch='\U113';
//        System.out.printf("I am %c : %d",ch, 41);
//        for (int i = 0; i <300 ; i++) {
//            char c= (char) i;
//            System.out.println(i+" : "+c);
//        }

        System.out.println("Character.MAX_VALUE= "+(int)Character.MAX_VALUE);

    }

}
