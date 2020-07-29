package HW4;
import java.util.Scanner;
public class SacanTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true){
            String word = scanner.nextLine();
            if(word.equals("stop") || word.equals("")) break;
            sb.append(word).append(System.lineSeparator());
        }
        scanner.close();
        System.out.println(sb);
        System.out.println("________________________--");

    }
}
