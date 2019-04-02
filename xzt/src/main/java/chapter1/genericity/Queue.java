package chapter1.genericity;

import java.util.Iterator;

/**
 * 使用链表实现队列
 * @param <T>
 */
public class Queue<T> implements Iterable<T> {

    private Node first;
    private Node last;
    private int size;
    private class Node{
        T item;
        Node next;
    }

    public void enQueue(T item){
        Node newLast = new Node();
        newLast.item = item;
        if (isEmpty()){
            first = newLast;
        }else {
            last.next = newLast;
        }
        last = newLast;
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T deQueue(){
        T item = first.item;
        first = first.next;
        size--;
        if (isEmpty()){
            last = null;
        }
        return item;
    }

    public int size(){
        return size;
    }

    private class QueueIterator implements Iterator<T>{
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
        return new QueueIterator();
    }
}
