package LambdaTest.ReturnTest;

public class ReturnMain {
    public static void main(String[] args) {
        ReturnLambdaTest r = (s)->"You wrote: " + s;
        RetStringFromEmpty r2 = ()->"You wrote nothing";
        System.out.println(r.testLambda("Hop-Hop"));

        ReturnIntTest plus = (x,y)->x + y;
        ReturnIntTest mult = (x,y)->x * y;
        System.out.println(plus.intReturn(5,3));
        System.out.println(mult.intReturn(5,3));

        IntArrayLambda summ = (l)->{
            int s = 0;
            for (int i = 0; i < l.length; i++) {
                s += l[i];
            }
            return s;
        };
        int []a = new int[]{1,2,3,4};
        System.out.println("Sum of arr = " + summ.retIntArray(a));
        System.out.println(r2.retString());
    }
}
