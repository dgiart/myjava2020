package HW2;


import java.sql.Array;
import java.util.AbstractList;
import java.util.ArrayList;

public class Test {
    Object[]arr=new Object[0];
    public int size() {
        return arr.length;
    }
    public void add(Object element) {
        Object[]newarr=new Object[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length]=element;
        arr=newarr;
        }

    @Override
    public String toString() {
        StringBuilder b=new StringBuilder();
        b.append("[");
        for (int i = 0; ; i++) {
            b.append(arr[i].toString());
            if (i==arr.length-1){
                return b.append("]").toString();
            }
            b.append(",");
        }
    }

    public static void main(String[] args) {
        Long ten=10L;
        Long ten2=10L;
        ten++;
        ten2++;
//        five++;
//        five2++;
        System.out.println(ten == ten2);

//        Integer i = new Integer(10);
//        i++;
//        System.out.println(i);
//        System.out.println("START");
//        Test t=new Test();
//        t.add("A");
//        t.add("B");
//        t.add("C");
//        System.out.println(t.size());
//        System.out.println(t.toString());
//        System.out.println("C".equals("C"));
//        Object[]arr1=new Object[]{1,2,3,4,5};
//        Object []arr2=new Object[10];
//
//        System.arraycopy(arr1,1,arr2,2,2);
//        for (int i = 0; i <arr2.length ; i++) {
//            System.out.println(arr2[i]);
//        }
//        ArrayList<Object> list=new ArrayList<Object>(20);
//        list.add("A");
//        list.add(null);
//        list.add("C");
////        list.add(10,"X");
//        System.out.println(list.toString());
//        for (Object o:list ) {
//            System.out.println(o.toString());
//        }
//
////        AbstractList
//        int []arr1=new int []{1,2,3,4,5};
//        int []arr2=new int [10];
//        System.arraycopy(arr1, 0,arr2,0,arr1.length);
//        for (int el:arr2 ) {
//            System.out.println(el);
//        }

    }
}
