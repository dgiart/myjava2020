package epam06_20;

public class LettersTable {
    final static String ARROW = "==>";
    public static void main(String[] args) {

        System.out.println("AZ"+ARROW+str2int("AZ"));
        System.out.println(int2str(52));
        System.out.println(rightColumn("AA"));

    }
    static int str2int(String str){
        int res=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            res=26*res+ch-'A'+1;
        }
        return  res;
    }
    static String int2str(int number){
        StringBuilder snumbers=new StringBuilder();
        while (number > 0){
            number--;
            char ch = (char) (number % 26+'A');
            snumbers.append(ch);
            number/=26;
        }
        return snumbers.reverse().toString();
    }
    public static String rightColumn(String number) {
        int numberint = str2int(number);
        return int2str(numberint + 1);
    }

}
