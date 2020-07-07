package HW2;


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
//        System.out.println("START");
//        Test t=new Test();
//        t.add("A");
//        t.add("B");
//        t.add("C");
//        System.out.println(t.size());
//        System.out.println(t.toString());
        System.out.println("C".equals("C"));
    }
}
