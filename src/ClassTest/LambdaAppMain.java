package ClassTest;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.lang.Math;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class LambdaAppMain {
    static Double dist(Double x, Double y){
        return Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {

        Predicate<Double> isPositive = x -> x > 0;
        isPositive.test(33.);

        System.out.println(isPositive.test(5.)); // true
        System.out.println(isPositive.test(-7.)); // false

        UnaryOperator <Double> log=x-> Math.log(x);
        System.out.println("ln(10)="+log.apply(10.));

        BinaryOperator <Double> dist=(x,y)->Math.sqrt(x*x+y*y);
        System.out.println("dist(3,4)="+dist.apply(3.,4.));
        dist(2.,5.);
        int[]a=new int[]{1,2,3};
        Arrays.stream(a).forEach(e-> System.out.println(e*e));
        OptionalInt ma=Arrays.stream(a).max();
        System.out.println("max="+ma.getAsInt());
        IntStream b=Arrays.stream(a).filter(x->x==2);
        System.out.println("b: "+b);




    }

}
