package HW5;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Part4 {
    static long T = 0;
    static int M;
    static int N;
    static int maxValues[];
    static void max1D(String fileName){
        maxValues = new int[M];
        int count = 0;
        try {
            Scanner scanner = new Scanner(new File(fileName), "utf8");
            while (scanner.hasNextLine()) {

                String[]line = scanner.nextLine().split(" ");
                N = line.length;
                int []intLine = new int[N];
                for (int i = 0; i < N; i++) {
                    intLine[i] = Integer.parseInt(line[i]);
                }
                int finalCount = count;
                int finalCount1 = count;
                new Thread(){
                    public void run(){
                    maxValues[finalCount1] = maxNum1D(intLine);
                    }
                }.start();
                count++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            scanner.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    static int max2D(String fileName){
        List<String[]> sList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(fileName), "utf8");
            while (scanner.hasNextLine()) {
                M++;
                String[]line = scanner.nextLine().split(" ");
                sList.add(line);
                N = line.length;
            }
            scanner.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int [][]res = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = Integer.parseInt(sList.get(i)[j]);
            }
        }

        return maxNum2D(res);
    }


    static int maxNum1D(int []nums){
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m) m = nums[i];
        }
        return m;
    }
    static int maxNum2D(int [][]nums){
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > m) m = nums[i][j];
            }

        }
        return m;
    }
    public static void main(String[] args){

        long start2D = System.nanoTime();
        int max2D = max2D("randoms.txt");
        long fin2D = System.nanoTime();
        System.out.println("max2D = " + max2D + "; time2D = " + (fin2D - start2D));
        long start1D = System.nanoTime();
        max1D("randoms.txt");
        int max1D = maxNum1D(maxValues);
        long fin1D = System.nanoTime();
        System.out.println("max1D = " + max1D + "; time1D = " + (fin1D - start1D));
        System.out.println("t2/t1 = " + (fin2D - start2D)/(fin1D - start1D));
        System.out.println("\n*******************************\n");
        System.out.println(max1D == max2D);
        System.out.println(max1D);
        System.out.println(TimeUnit.NANOSECONDS.toMillis(fin1D - start1D));
        System.out.println(max2D);
        System.out.println(TimeUnit.NANOSECONDS.toMillis(fin2D - start2D));
    }

}
