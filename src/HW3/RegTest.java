package HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {
    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static boolean dumbCheck(String userNameString){

        char[] symbols = userNameString.toCharArray();
        if(symbols.length < 3 || symbols.length > 15 ) return false;

        String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

        for(char c : symbols){
            if(validationString.indexOf(c)==-1) return false;
        }

        return true;
    }
    public static boolean test(String testString) {
        Pattern p = Pattern.compile("^.+\\.com|^.+ua|^.+ru");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void main(String[] args) {
        String name= "kkk-kkk";
        System.out.println(dumbCheck(name));
        System.out.println(checkWithRegExp(name));
    }
    }
