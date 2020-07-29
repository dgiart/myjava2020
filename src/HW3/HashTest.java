package HW3;

public class HashTest {
    public static void main(String[] args) {
        byte el = -5;
        System.out.println(Byte.toString(el));
        System.out.println(Integer.toBinaryString(0xff));
        System.out.println(Integer.toBinaryString(el&0xff));
        System.out.println(el&0xf);

//        for (byte i =  - 15; i < 16 ; i++) {
//            String hnum = Integer.toHexString(i);
//
//            System.out.println(i + " : " + hnum);
//            System.out.println(Integer.toBinaryString(i));
//
//        }
//        System.out.println(Integer.toBinaryString(0xff));
    }
}
