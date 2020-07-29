package HW2;

import java.util.Iterator;

public class ListImpl implements List {

    Node tail;
    Node head;
    int size;

    public class Node {
        Object value;
        Node next;
    }

    public ListImpl() {
        tail = head = null;
        size = 0;
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
    public void addFirst(Object element) {
        Node temp = new Node();
        temp.value = element;
        if ((head != null) && (tail != null)) {
            temp.next = head;
            head = temp;
        } else {
            head = tail = temp;
        }
        size++;
    }

    @Override
    public void addLast(Object element) {
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
    public void removeFirst() {
        if (size == 0) return;
        head = head.next;
        size--;
    }

    @Override
    public void removeLast() {
        if (size == 0) return;
        Node temp = head;
        while (temp != tail) {
            if (temp.next == tail) {
                tail = temp;
                temp.next = null;
                size--;
                return;
            }
            temp = temp.next;
        }
    }

    @Override
    public Object getFirst() {
        if (size == 0) return null;
        return head.value;
    }

    @Override
    public Object getLast() {
        if (size == 0) return null;
        return tail.value;
    }

    @Override
    public Object search(Object element) {
        if (size == 0) return null;
        Node current = head;
        while (tail.next != current) {
            if (element == current.value) {
                return element;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public boolean remove(Object element) {
        if (size == 0) return false;
        if (element == null) return false;
        System.out.println("Removing of: " + element + " func");
        System.out.println("head = " + head.value);
        System.out.println("tail = " + tail.value);
        if (element.equals(head.value)) {
            removeFirst();
            return true;
        }
        if (element.equals(tail.value)) {
            removeLast();
            return true;
        }

        Node current = head;
        while (tail != current) {
            System.out.println("current = " + current.value);
            if (element.equals(current.next.value)) {
                System.out.println("current.next.value" + current.next.value);
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;

        }
        return false;

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
        ListImpl list = new ListImpl();
        list.remove(null);
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addFirst("X");
        list.addFirst("Y");
        for (Object o : list) {
            System.out.println(o);
        }

        list.removeLast();

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("list.head.next = " + list.head.next.value);
        System.out.println("list.head = " + list.tail.value);
        list.clear();
        System.out.println("after clear");
        for (Object o : list) {
            System.out.println(o);
        }
        list.getFirst();
    }
}