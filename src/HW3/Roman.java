package HW3;


import java.util.LinkedList;
import java.util.List;

public class Roman {
    public enum ROM{
       I(1),V(5),X(10);
       int value;
       ROM(int i){
           this.value = i;
       }
    }
    final static String [] ROMANS = {"0", "I", "II", "III", "IV","V","VI", "VII", "VIII", "IX", "X" };
    static String formNumLess3(String str, int num){
        StringBuilder strNum = new StringBuilder(str);
        for (int i = 1; i <=num ; i++) {
            strNum.append("I");
        }
        return strNum.toString();
    }
    static String arabic2roman(int x){
        if (x  < 4){
            return formNumLess3("",x);
        }
        if (x == 4) return "IV";
        if (x == 5) return "V";
        if (x > 5 && x < 9){
            return formNumLess3("V",x - 5);
        }
        if (x == 9) return "IX";
        if (x == 10) return "X";

        return null;
    };
    static int firstDigit(int x){
        return x%10;
    }
    static int secondDigit(int x){
        return (x/10);
    }
    static boolean isRoman(CharSequence numStr){
        StringBuilder sbnums = new StringBuilder();
        for (ROM val:
             ROM.values()) {
            sbnums.append(val.name());
        }
        String roms = sbnums.toString();
        if (roms.contains(numStr)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
//        System.out.println(Integer.parseInt(I)*3);
//        System.out.println(firstDigit(53));
//        System.out.println(secondDigit(53));
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + "=" + arabic2roman(i));
//        }
//        for (int i = 0; i <ROMANS.length ; i++) {
//            System.out.println(i +" : " + ROMANS[i]);
//        }
        String romanNum = "I";
        char []nums = romanNum.toCharArray();
        for (char l:
             nums) {
            System.out.println(isRoman(String.valueOf(l)));
        }
        for (int i = 0; i <romanNum.length() ; i++) {
            if (i == romanNum.length() - 1) {
                System.out.println(romanNum.length());
                if (romanNum.equals(ROM.I.name())) System.out.println(ROM.I.value);
                if (romanNum.equals(ROM.V.name())) System.out.println(ROM.V.value);
                if (romanNum.equals(ROM.X.name())) System.out.println(ROM.X.value);
            } else {

            }
            List<Integer> xx = new LinkedList<Integer>();
            xx.add(1);
            xx.add(2);
            xx.add(2);
            xx.add(3);
//            xx.g
//            xx.remove((Object)2);
            System.out.println(xx);
            String a="abcssssssssssssssAAAsssd";
            String b="abcssssssssssssssAAAsssd";
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());


        }

    }
    }



