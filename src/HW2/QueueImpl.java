package HW2;


import java.util.Iterator;

public class QueueImpl implements Queue {
    Object [] arr;

    public QueueImpl() {
        arr=new Object[0];
    }

    @Override
    public void clear() {
        arr=new Object[0];
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
    public void enqueue(Object element) {
        Object[] newarr = new Object[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length] = element;
        arr=newarr;
    }

    @Override
    public Object dequeue() {
        Object head=arr[0];
        Object [] newarr = new Object [arr.length-1];
        int newarri=0;
        for (int i = 1; i < arr.length; i++) {
                newarr[newarri] = arr[i];
                newarri++;
            }
        arr=newarr;
        return head;
    }

    @Override
    public Object top() {
        return arr[0];
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
        System.out.println("START Queue");
        QueueImpl queue=new QueueImpl();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.print(queue.toString());
        System.out.println("dequeue() = "+queue.dequeue());
        System.out.print(queue.toString());
    }

}


