package HW5;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MaxTest {
    static long T = 0;
    static int M = 4;
    static int N = 100;
    static int maxValues[] = new int[M];
    static MaxThread maxThread[] = new MaxThread[M];

    static int[][] readMatrix(String fileName){
        List<String[]> sList = new ArrayList<>();
        int M = 0;
        int N = 0;
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
//        System.out.println("M = " + M);
//        System.out.println("N = " + N);
        return res;
    }

    static void writeIntMatrix(int M, int N,String fileName){
        Random rand = new Random();
        StringBuilder rands = new StringBuilder();
        for (int i = 0; i < M ; i++) {
            for (int j = 0; j < N; j++) {
                rands.append(rand.nextInt(1000));
                rands.append(" ");
            }
            rands.append(System.lineSeparator());
        }
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(rands.toString());
            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    static int maxNum1D(int []nums){
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m) m = nums[i];
        }
        return m;
    }
    static class MaxThread extends Thread{
        int i;
        int res[];

        public MaxThread(int i, int[] res) {
            this.i = i;
            this.res = res;
        }

        public void run(){
            synchronized ("asdf"){
//                System.out.println(Thread.currentThread().getName());
                long s1 = System.nanoTime();
//                System.out.println("Thread#" + Thread.currentThread().getName() + "; s1 = " + s1);
                maxValues[i] = maxNum1D(res);
                long s2 = System.nanoTime();
                long s = s2-s1;
                T+= s;
//                System.out.println("Thread#" + Thread.currentThread().getName() + "; s2 = " + s2);
//                System.out.println("Thread#" + Thread.currentThread().getName() + "; Time" + "System.nanoTime() = " + s);
            }
        }
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
    public static void main(String[] args) {
        for (int count = 0; count < 1; count++){
            writeIntMatrix(M, N, "randoms.txt");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int[][] result = readMatrix("randoms.txt");
//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
        int maxNum2D = 0;
        int maxMany = 0;


            long start = System.nanoTime();
            int max = maxNum2D(result);
            long fin = System.nanoTime();
            System.out.println("max = " + max + "; time = " + (fin - start));
//            System.out.println("maxOnethread =" + maxNum2D);


//            System.out.println("max1 = " + maxNum1D(result[0]));
//            System.out.println("max2 = " + maxNum1D(result[1]));
//            System.out.println("max3 = " + maxNum1D(result[2]));
//            System.out.println("max4 = " + maxNum1D(result[3]));
//            System.out.println("System.nanoTime() 2 = " + System.nanoTime());
        for (int i = 0; i < M; i++) {
            long ss = System.nanoTime();
            maxThread[i] = new MaxThread(i, result[i]);
            long sss = System.nanoTime();
//                System.out.println("time fo " + i + " iter in NEW in main = " + (sss - ss));
        }
        long start1D = System.nanoTime();
        for (int i = 0; i < M; i++) {
//                maxThread[i] = new MaxThread(i, result[i]);
            long ss = System.nanoTime();
            maxThread[i].start();
            long sss = System.nanoTime();
//                System.out.println("time fo " + i + " iter in START in main = " + (sss - ss));
//                try {
//                    maxThread[i].join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                maxThread[i].setName(String.valueOf(i));
        }
//            for (int i = 0; i < M; i++) {
//                try {
//                    maxThread[i].join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
            for (int x :
                    maxValues) {
                System.out.println("max x = " + x);
            }
        long fin1D = System.nanoTime();
        System.out.println("Time for 1d search T = " + (fin1D - start1D) + "ns");
        maxMany = maxNum1D(maxValues);
        System.out.println("maxNum1D = " + maxMany);
        System.out.println(max == maxMany);
            System.out.println("T = " + T);

    }
    }
}
