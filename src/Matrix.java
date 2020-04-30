import java.util.Arrays;
import java.util.Random;

public class Matrix {
    static void printMatrix(int [][]matr){
        for (int []elout:
             matr) {
            for (int elin:elout) {
                System.out.print(elin+"\t");
            }
            System.out.println("\n");
        }
    }
    static int sum(int[][]matr){
        int sum=0;
        for (int[]elout:matr) {
            for (int elin:elout  ) {
                sum+=elin;
            }
        }
        return sum;
    }

    static int max(int[][]matr){
        int max=0;
        for (int i=0;i<matr.length;i++){
            for (int j=0;j<matr.length;j++){
                max=matr[i][j]>max?matr[i][j]:max;
            }
        }
        return max;
    }

    static int min(int[][]matr){
        int min=0;
        for (int i=0;i<matr.length;i++){
            for (int j=0;j<matr.length;j++){
                min=matr[i][j]<min?matr[i][j]:min;
            }
        }
        return min;
    }



    static int[][] randmatr(int N,int M){
        int [][]matr=new int[N][N];
        Random rand = new Random();
        for (int i=0;i<matr.length;i++){
            for (int j=0;j<matr.length;j++){
                matr[i][j]=rand.nextInt(M)-(M-1)/2;
            }
        }
        return matr;
    }
    public static void main(String[] args) {

        int N=Integer.parseInt(args[0]);
        int M=Integer.parseInt(args[1])*2+1;
//        Arrays.stream().min()

        int[][] Matr=randmatr(N,M);
//        printMatrix(Matr);
        System.out.println("Sum= "+sum(Matr));
        System.out.println("Max= "+max(Matr));
        System.out.println("Min= "+min(Matr));
        System.out.println("Mean= "+(double)sum(Matr)/((double)(N*N)));

    }
}
