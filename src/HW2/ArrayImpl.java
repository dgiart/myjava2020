package HW2;


import java.util.Iterator;

public class ArrayImpl implements Array {
    Object[]arr;
    int size;
    int defoultSize=10;
    public ArrayImpl(){
        size=0;
        arr=new Object[defoultSize];
    }

    public ArrayImpl(int s){
        size=0;
        arr=new Object[s];
    }

    @Override
    public void clear() {
        this.arr=new Object[0] ;
    }

    @Override
    public int size() {
        return this.size;
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
        if (size == arr.length - 1){
            Object[] newarr = new Object[arr.length * 2];
            System.arraycopy(arr,0,newarr,0,arr.length);
            arr=newarr;
        }

        arr[size] = element;
        size++;
    }

    @Override
    public void set(int index, Object element) {
        if(index<size && index >= 0){
            arr[index] = element;
        }
        else {
            System.out.print("indexOutOfRange: [" + 0 + ".." + (size) + "]");
        }
    }

    @Override
    public Object get(int index) {
        if (index < size && index >= 0){
            return arr[index];
        }
        else{
            System.out.print("indexOutOfRange: ["+ 0 + ".." + (size) + "]");
            return null;
        }

    }

    @Override
    public int indexOf(Object element) {
        if (element == null) {
            for (int i = 0; i < size; i++)
                if (arr[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (element.equals(arr[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        if (index < size && index >= 0){
            int move = size - index - 1;
            if (move > 0)
                System.arraycopy(arr, index+1, arr, index,
                        move);
            arr[--size] = null;

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
            b.append(String.valueOf(arr[i]));
            if (i==size){
                return b.append("]").toString();
            }
            b.append(",");
        }
    }

    public static void main(String[] args) {
        System.out.print("START");
        ArrayImpl a = new ArrayImpl();
        a.add("A");
        a.add("B");
        a.add("C");
//        System.out.println(a.arr[0]);
        System.out.print(a.toString());
        System.out.print(a.size());
        a.set(1,"XXX");
        System.out.print(a.toString());
//        a.set(5,"");
//        System.out.print("index of C ="+a.indexOf("C"));
//        System.out.print(a.get(0));
//        System.out.print("size before rem="+a.size());
////
//        a.remove(0);
//        System.out.print("size after rem="+a.size());
//        System.out.print(a.toString());
//        System.out.print("END");
//        Object o=null;
//
    }

}
