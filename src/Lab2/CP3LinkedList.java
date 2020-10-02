package Lab2;

import java.util.NoSuchElementException;

public class CP3LinkedList <E> {
    private class Node {
        public E data;
        public Node next;


    }

    private Node first;
    private Node last;

    public CP3LinkedList() {
        first = null;
        last = null;
    }

    public E getFirst() {

        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public void addFirst(E element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;

    }
    public void addLast(E element) {

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = null;
        if(last != null)
            last.next = newNode;
        if(first == null)
            first = newNode;

        last = newNode;
    }

    public void removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        first = first.next;
        if(first == null)
            last = null;
    }

    public boolean isEmpty() {
/*        if(first == null) return true;
           else return false;
    }*/
        return first == null;
    }

    public void print(){
        Node current = first;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }
    public int size(){
        Node current = first;
        int currentSize = 0;

        while(current != null){
           currentSize++;

          current = current.next;
        }

        return currentSize;

    }

    public boolean containsElement(E element){
        Node current = first;

        while(current != null){
            if(current.data.equals(element))
                return true;

            current = current.next;

        }
        return false;

    }

}
