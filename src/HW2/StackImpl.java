package HW2;

import java.util.Iterator;

public class StackImpl implements Stack {
    Node tail;
    Node head;
    int size;

    public class Node {
        Object value;
        Node next;
    }


    @Override
    public void clear() {
       Node current = head;
        while (current != tail){
            Node temp = current;
            System.out.println(current.value);
            current.value = 0;
            current = null;
            current = temp.next;
        }

        size = 0;
        tail = head = null;
    }

    @Override
    public int size() {
        return size;
    }

    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<Object> {
        Node current = head;

        @Override
        public boolean hasNext() {
            if (size == 0) return false;
            return tail.next != current;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                Node temp = current;
                current = current.next;
                return temp.value;
            }
            return null;
        }

    }

    @Override
    public void push(Object element) {
        Node temp = new Node();
        temp.value = element;

        if ((head != null) && (tail != null)) {
            tail.next = temp;
//            temp.next = tail;
            tail = temp;

        } else {
            head = tail = temp;
        }
        size++;
    }

    @Override
    public Object pop() {
        if (size == 0) return null;
        Node pop = tail;
        Node temp = head;
        while(temp != tail){
            System.out.println(temp.value);
            if(temp.next == tail){
                tail = temp;
                temp.next = null;
                size --;
                return pop.value;
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public Object top() {
        return tail.value;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder b = new StringBuilder();
        b.append("[");
        Node node = head;
        while (true) {
//            System.out.println("value = " + node.value);
//            System.out.println("next value = " + node.next.value);
            b.append(String.valueOf(node.value));
            if (node == tail) {
                return b.append("]").toString();
            }
            b.append(", ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        StackImpl stack=new StackImpl();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        for (Object o: stack) {
            System.out.println(o);
        }
        System.out.println("stack: "+stack.toString());
        System.out.println("stack.tail.value = "+ stack.tail.value);
        System.out.println("stack.tail.value = "+ stack.head.value);
//        System.out.println("stack.tail.value+ = "+ stack.tail.next.nexvalue);
//        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println("stack after pop: "+ stack.toString());
        System.out.println(stack.top());

    }

}
