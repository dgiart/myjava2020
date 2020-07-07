package epam06_20;

import java.io.IOException;

public class Hi1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int[]nums2=nums.clone();
        nums2[1]=100;
        for (int x: nums ) {
            System.out.println(x);
        }
        char ch='\u0111';
//        System.out.println("hi1");
//
//        char []val={'q','w','e','r','t','y'};
//        for (int i = 0; i <val.length ; i++) {
//            System.out.println(val[i]);
//        }
//        String s=new String(val,1,3);
//        System.out.println(s);
//        String s1=new String(1,3,val);




    }
}
