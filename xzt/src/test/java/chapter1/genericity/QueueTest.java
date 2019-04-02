package chapter1.genericity;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue<String> strings = new Queue<String>();
    @Test
    public void enQueue() {
        strings.enQueue("abc");
        assertEquals(1,strings.size());
        assertEquals("abc",strings.deQueue());
    }

    @Test
    public void isEmpty() {
        strings.enQueue("abcdaf");
        assertEquals(1,strings.size());
        strings.deQueue();
    }

    @Test
    public void deQueue() {
        strings.enQueue("hellow");
        assertEquals("hellow",strings.deQueue());
    }

    @Test
    public void size(){

    }
}