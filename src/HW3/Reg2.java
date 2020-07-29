package HW3;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
    static void showLetters(String text2){
        char [] letters = text2.toCharArray();
        for (char letter:
                letters) {
            System.out.println(letter + " : " + (int)letter);

        }
    }

    static boolean isStartUpper(String word){
        if(word.substring(0,1).equals(word.substring(0,1).toUpperCase())){
            return true;
        }
        else {
            return false;
        }
    }
    static boolean isReccuring(String[] text2, String word){
        int count = 0;
        for (String sWord: text2) {
            if (word.equals(sWord)) {
                count++;
            }
        }
        return count >= 2 ? true : false;
    }
    public static void main(String[] args) {
        String text = "aaa bbb\nccc ddd\neee";
        String text2 = "aaa bbb" + System.lineSeparator() + "ccc ddd" + System.lineSeparator() + "eee";
        System.out.println(text2);
//        System.out.println("n");
//        System.out.println(Arrays.toString(text2.split("\\n")));
//        System.out.println("s");
//        System.out.println(Arrays.toString(text2.split("\\s")));
//        System.out.println("n");
//        System.out.println(Arrays.toString(text2.split("\n")));
//        System.out.println("b");
//        System.out.println(Arrays.toString(text2.split("\\b")));
        System.out.println("B");
        System.out.println(Arrays.toString(text2.split("\\b")));
//        System.out.println(text2.split("\\n").equals(text2.split("\n")));
        for (String word:
                text2.split("\\B")) {
            showLetters(word);
        }


//        Pattern p;
//        StringBuilder sb = new StringBuilder();
//        p = Pattern.compile(".+\\b");
//        Matcher m = p.matcher(text2);
//        int count = 0;
//
//        while (m.find()) {
//            count ++;
//        }
//        StringBuilder []arr = new StringBuilder[count];
//        count = 0;
//        Matcher m2 = p.matcher(text2);
//        while (m2.find()) {
//            System.out.println("count = " + count);
//
//            String group = m2.group();
//            System.out.println("group: " + group);
//            arr[count] = new StringBuilder(group);
//            count ++;
//        }
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//        for (StringBuilder sbs:
//             arr) {
//            System.out.println(sbs);
//        }
//        System.out.println(count);
//        System.out.println("***");
//        System.out.println(text2);
//        String []newtext2 = text2.split("\\s");
//        char[]arr = newtext2[0].toCharArray();
//        for (char l:
//             arr) {
//            System.out.println(l + " : " + (int)l);
//        }
////        System.out.println(arr[0]);
//        for (String s:
//             newtext2) {
//            System.out.println(s);
//        }

//        char l ='\n';
//        System.out.println((int)l);
//        for (char i = 0; i <40 ; i++) {
//            System.out.println(i + " : " + (int)i);
//        }

//        String []text2=new String[]{"aba", "CCC", "aBa", "aba"};
//        System.out.println(isReccuring(text2,"xxx"));
//        String str = "klhh'h";
//        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
//        System.out.println(str);
//        StringBuilder sb = new StringBuilder();
//        sb.append("aaa");
//        sb.append("ccc");
//        sb.append("bbb");
//        System.out.println(sb.length());
//        String a = "zAAaa";
//        System.out.println(isStartUpper(a));
//        System.out.println(a.substring(0,1) +"  "  + a.substring(0,1).toUpperCase());


    }
}
