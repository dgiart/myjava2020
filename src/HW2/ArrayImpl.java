package HW2;


import java.util.Iterator;

public class ArrayImpl implements Array {
    Object[]arr=new Object[0];

    @Override
    public void clear() {
        this.arr=new Object[0];
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<Object> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

    }

    @Override
    public void add(Object element) {
        Object[] newarr = new Object[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length] = element;
        arr=newarr;
    }

    @Override
    public void set(int index, Object element) {
        if(index<arr.length && index >= 0){
            arr[index] = element;
        }
        else {
            System.out.print("indexOutOfRange: [" + 0 + ".." + (arr.length - 1) + "]");
        }
    }

    @Override
    public Object get(int index) {
        if (index < arr.length && index >= 0){
            return arr[index];
        }
        else{
            System.out.print("indexOutOfRange: ["+ 0 + ".." + (arr.length - 1) + "]");
            return null;
        }

    }

    @Override
    public int indexOf(Object element) {
        for (int i = 0; i <arr.length ; i++) {
            if(element.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        if (index < arr.length && index >= 0){
            Object [] newarr = new Object [arr.length-1];
            int newarri=0;
            for (int i = 0; i < arr.length; i++) {
                if(i != index){
                    newarr[newarri] = arr[i];
                    newarri ++;
                }
            }
            arr=newarr;
        }
        else {
            System.out.print("indexOutOfRange: ["+ 0 + ".." + (arr.length - 1) + "]");
        }
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
        System.out.println("START");
        ArrayImpl a=new ArrayImpl();
        a.add("A");
        a.add("B");
        a.add("C");
//        System.out.println(a.size());
        System.out.println(a.toString());
        a.set(1,"XXX");
        System.out.println(a.toString());
        a.set(5,"");
//        a.clear();
//        System.out.println(a.size());
        System.out.println("index of C ="+a.indexOf("C"));
        System.out.println(a.get(0));
        a.remove(0);
        System.out.println(a.toString());
        System.out.println("END");
    }

}