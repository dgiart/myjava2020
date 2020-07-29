package HW4;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Part3Test {
    public static String getInput(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(fileName), "cp1251");
//            Scanner scanner = new Scanner(new File(fileName), "utf-8");
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            scanner.close();
            return sb.toString().trim();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = getInput("part3.txt");
        System.out.println(input);
        input.contains("[a-zA-Z]");
        String[] words = input.split("\\s");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = null;
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("stop")) break;
            else if (answer.equals("int")) {
                pattern = Pattern.compile("^\\d*$");
            }
            else if (answer.equals("char")) {
                pattern = Pattern.compile("^[a-zA-Zа-яёФ-ЯЁ]{1}$");
            }
            else if (answer.equals("String")) {
                pattern = Pattern.compile("[a-zA-Zа-яёФ-ЯЁ]{2,}");
            }
            else if (answer.equals("double")) {
                pattern = Pattern.compile("(\\.\\d+)|(\\d+\\.\\d+)");
            }
            else {
                System.out.println("Unsupported input");
            }
            for (String word :
                    words) {

                Matcher intMatcher = pattern.matcher(word);
                while (intMatcher.find()) {
                    System.out.println(intMatcher.group());
                }
            }


        }
        scanner.close();
    }
}
