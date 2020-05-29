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

    static int[][]tranpont(int[][]matr){
        int n=matr.length;
        int tr[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                tr[i][j]=matr[j][i];
            }
        }
        return tr;
    }
    static  int[][]swap(int[][]matr,int k, int m){
        int n=matr.length;
        int tmp[][]=Arrays.copyOf(matr,n) ;
        tmp[k]=matr[m];
        tmp[m]=matr[k];
        return tmp;
    }
    static  int[][]rowSort(int [][]matr, int col){
        int sortmatr[][]=Arrays.copyOf(matr,matr.length);
        Arrays.sort(sortmatr, (x, y) -> x[col]-y[col]);
        return sortmatr;
    }

    static  int[][]colSort(int [][]matr, int row){
        int sortmatr[][]=tranpont(matr);
        Arrays.sort(sortmatr, (x, y) -> x[row]-y[row]);
        return tranpont(sortmatr);
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
        int col=Integer.parseInt(args[2]);
        int row=Integer.parseInt(args[3]);
//        Arrays.stream().min()

        int[][] Matr=randmatr(N,M);
        System.out.println("Matr");
        printMatrix(Matr);
        int sortCol[][]=colSort(Matr,col);
        int sortRow[][]=rowSort(Matr,row);
//        int sortmatr[][]=Arrays.copyOf(Matr,N);
//        Arrays.sort(sortmatr, (x, y) -> y[1]-x[1]);
//        Arrays.so

//        System.out.println("\nswap");
//        int[][] Sw=swap(Matr,1,2);
//        printMatrix(Sw);
        System.out.println("ColSorted");
        printMatrix(sortCol);
        System.out.println("RowlSorted");
        printMatrix(sortRow);
        System.out.println("Matr after");
        printMatrix(Matr);
//        char ch = 10;
//        float x=7.0f;
//        int i = 32565;
////        byte b = 127;
//        int zz = 's';
//        System.out.println("zz= "+zz);
//
//        long a = 2147483647000L;
//        int b = 1;
//        b += a;
//        Object ab = (Object) b;
//        System.out.println(ab.getClass().getName() + " value: " + b);
//        long i=37;
//        System.out.println(1/0.);
        System.out.println(Integer.toBinaryString(37));
//        System.out.println(Integer.toBinaryString(-37));
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
        Integer i3 = 129;
        Integer i4 = 129;
        System.out.print(i3 == i4);
    }
}
