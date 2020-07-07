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
        Object[]newarr=new Object[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length]=element;
        arr=newarr;
    }

    @Override
    public void set(int index, Object element) {
        if(index<arr.length){
            arr[index]=element;
        }
        else {
            System.out.println("indexOutOfRange");
        }
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    @Override
    public void remove(int index) {

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
        System.out.println(a.size());
        System.out.println(a.toString());
        a.set(1,"XXX");
        System.out.println(a.toString());
        a.set(5,"");
        a.clear();
        System.out.println(a.size());

        System.out.println("END");
    }

}