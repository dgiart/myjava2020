package HW2;

import java.util.Iterator;

public class StackImpl implements Stack {
    Object[]arr=new Object[0];

    @Override
    public void clear() {
        this.arr=new Object[0];
    }

    @Override
    public int size() {
        return arr.length;
    }

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
    public void push(Object element) {
        Object[] newarr = new Object[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length] = element;
        arr=newarr;
    }

    @Override
    public Object pop() {
        Object top=arr[arr.length-1];
        Object [] newarr = new Object [arr.length-1];
        int newarri=0;
        for (int i = 0; i < arr.length-1; i++) {
            newarr[newarri] = arr[i];
            newarri++;
        }
        arr=newarr;
        return top;
    }

    @Override
    public Object top() {
        return arr[arr.length-1];
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
        StackImpl stack=new StackImpl();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("stack: "+stack.toString());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println("stack after pop: "+stack.toString());

    }

}
