package ThreadsEpam06_2020.quest;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Rem extends Thread{
    int t;
    String msg;
    Rem(int t,String msg){
        this.t=t;
        this.msg=msg;
    }
    public void run() {
        if(!Thread.interrupted()){
            try {
                TimeUnit.SECONDS.sleep(t);
                System.out.println(msg);
            } catch (InterruptedException e) {
                Quest.flag = false;
                currentThread().interrupt();
            }
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("By-By!");
                Quest.flag = false;
                return;
            } catch (InterruptedException e) {
                Quest.flag = false;
                currentThread().interrupt();
            }
        }
        Quest.flag = false;
    }
}
public class Quest {
    static String[] questions  = {"3*2?","what star earth moved around?","(sin(x))'=?"};
    static String[] answers = {"6","sun","cos(x)"};
    static boolean flag = true;
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(flag);
//            flag = true;
            int count = 0;
            while (flag == true){
                count++;
                System.out.println("count = " + count);
                System.out.println(questions[i]);
                Rem rem1=new Rem(10,"Are you here?");
                rem1.start();
                Scanner scanner=new Scanner(System.in);
                String answer=scanner.nextLine();
                if(answer.equals("stop")) {
                    rem1.interrupt();
                    flag = false;
                    break;
                }
                if(answer.equals(answers[i])){
                    System.out.println("Correct");
                    rem1.interrupt();
                    flag = true;
                    break;
                }
                else {
                    System.out.println("Your answer: " + answer + " is WRONG");
                }
            }
        }

        System.out.println("main FINISHED");
    }
}
