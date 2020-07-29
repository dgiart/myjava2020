package RegExpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {
    static private String getName(String data){
        Pattern pattern = Pattern.compile(";.+;");
        Matcher matcher = pattern.matcher(data);
        StringBuilder login = new StringBuilder();
        while (matcher.find()){
            login.append(matcher.group()).deleteCharAt(login.length()-1).deleteCharAt(0);
        }
        return login.toString();
    }

    static private String getEmail(String data){
        Pattern pattern = Pattern.compile("^.+?;");
        Matcher matcher = pattern.matcher(new StringBuilder(data).reverse());
        StringBuilder email = new StringBuilder();
        while (matcher.find()){
            email.append(matcher.group()).deleteCharAt(email.length()-1).reverse();
        }
        return email.toString();
    }

    public static void main(String[] args) {
        String text2 = "dgidgo artem";
        Pattern pattern = Pattern.compile(".+?\\p{Space}");
        Pattern pattern2 = Pattern.compile("\\p{Space}.+?$");
        Matcher matcher = pattern.matcher(text2);
        Matcher matcher2 = pattern2.matcher(text2);
        StringBuilder email = new StringBuilder();
        while (matcher2.find()){
            System.out.println(matcher2.group());
//            email.append(matcher.group()).deleteCharAt(email.length()-1).reverse();
        }

//        StringBuilder newData = new StringBuilder();
//        newData.append(getName(text2) + "(\"email:" + getEmail(text2) + "\")");
//        System.out.println("login: "+getName(text2)+"; emai: "+getEmail(text2));
//        System.out.println("newData: " + newData);
//        System.out.println(text2);
//        String s="jsvkjb;sakb;jj";
//        String[] ss = s.split(";");
//        for (String el: ss ) {
//            System.out.println(el);
//        }
//        System.out.println(ss.toString());

    }

}

