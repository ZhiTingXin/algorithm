package chapter1.genericity;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    private Node first;
    private int size;
    private class Node{
         T item;
         Node next;
    }

    public int size(){
        return size;
    }

    public void push(T item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    public T pop(){
        T item = first.item;
        first = first.next;
        size--;
        return item;
    }


    private class StackIterator implements Iterator<T>{
        private Node current = first;

        public boolean hasNext() {
            return current != null;
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
        return new StackIterator();
    }


}
