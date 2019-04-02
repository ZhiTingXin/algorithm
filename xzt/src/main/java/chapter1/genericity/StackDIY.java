package chapter1.genericity;


import java.util.Iterator;

/**
 * 数组实现栈
 * @author xzt
 * @since 2019-4-2
 * @param <T>
 */
public class StackDIY<T> implements Iterable <T>{
    private T[] s;
    private int size;
    //default 100
    private int max = 1;
    public StackDIY(){
        s = (T[]) new Object[max];
        size = 0;
    }

    public int size(){
        return size;
    }

    public T getNum(int i){
        return s[i];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(T num){
        //如果栈满
        if (size == max){
            resize(max*2);
        }
        s[size++]=num;
    }

    public T pop(){
        if (size==0){

        }
        //栈内元素少的时候收缩
        T t = s[--size];
        s[size] = null;
        if(size>0&&size==max/4)
            resize(max/2);
        return t;
    }

    private void resize(int num){
        T[] temp = (T[]) new Object[num];
        //赋值max
        max = num;
        System.out.println("resize : "+num);
        //copy
        for(int i=0;i<size;i++){
            temp[i]=s[i];
        }
        s = temp;
    }
    private class ReverseIterator implements Iterator {
        private int i = size;
        public boolean hasNext() {
            return i>0;
        }

        public Object next() {
            return s[--i];
        }

        public void remove() {

        }

    }

    public Iterator iterator() {
        return new ReverseIterator();
    }

}
