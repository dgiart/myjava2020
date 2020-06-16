package ThreadsEpam06_2020;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;


class Qw extends Thread{
    Rem rem;

    public Qw(Rem rem) {
        this.rem = rem;
    }

    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
        if (Integer.parseInt(n)==6) {
            System.out.println("Yes");

        }
        else {
            System.out.println("No");
        }
        this.rem.interrupt();
    }
}


class Rem extends Thread{
    int t;
    String msg;
    Rem(int t,String msg){
        this.t=t;
        this.msg=msg;
    }
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(t);
            System.out.println(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Quest {
    public static void main(String[] args) {
        System.out.println("2*3?");
        Rem rem1=new Rem(30,"Are you here?");
        rem1.start();
        Qw qw=new Qw(rem1);
        qw.start();
//        Scanner scanner=new Scanner(System.in);
//        String n=scanner.nextLine();

//        if (Integer.parseInt(n)==6) {
//            System.out.println("Yes");
//            rem1.interrupt();
//        }
//        else {
//            System.out.println("No");
//        }
        System.out.println("Main finished");
    }

}
