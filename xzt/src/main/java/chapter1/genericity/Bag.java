package chapter1.genericity;

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {

    private int size;
    private Node first;

    public boolean isEmpty(){
        return size==0;
    }

    public void add(T item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    public int size(){
        return size;
    }

    private class Node{
        T item;
        Node next;
    }
    private class BagIterator implements Iterator<T>{
        private Node current = first;
        public boolean hasNext() {
            return !isEmpty();
        }

        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {

        }
    }
    public Iterator<T> iterator() {
        return new BagIterator();
    }
}
