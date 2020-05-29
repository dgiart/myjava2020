import java.util.*;
import java.math.BigDecimal;

public class EpamTests {
    static int i[];
    static class Item{}
    public static void main(String[] args) {

        System.out.println("KKK");
        int [][][] mas = new int[2][3][4];//{{{1, 2, 3}, {4, 5, 6}, {10001}, {7, 8, 9}, {11, 12}},{{3333},{4444}},{{0},{0,0,0}}};
        for (int[][] el:
                mas) {
            System.out.println("Next el");
            for (int []i:
                 el) {
                System.out.println("Next i");
                for (int x:
                     i) {
                    System.out.println(x);
                }

            }

        }
//        mas.
//        System.out.println(mas2);
//        byte i=(byte)9;
//        System.out.println(i);
//        byte b = 3;
//        Object a=i+b;
//        System.out.println(a.getClass().getName() + " value: " + a);
//        System.out.println(-15%7);


//        Object []i;//={1,2,3};
//        Object obj=i[0];
//        System.out.println(i);
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(-5));
//        System.out.println(Integer.parseInt("10101",2));
        


    }
}
