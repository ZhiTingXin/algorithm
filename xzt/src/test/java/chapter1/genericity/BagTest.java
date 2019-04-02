package chapter1.genericity;

import org.junit.Test;

import static org.junit.Assert.*;

public class BagTest {
    private Bag<String> strings = new Bag<String>();

    @Test
    public void isEmpty() {
        assertTrue(strings.isEmpty());
        assertEquals(0,strings.size());
    }

    @Test
    public void add() {
        strings.add("abcd");
        assertEquals(1,strings.size());
    }

    @Test
    public void size() {
        assertEquals(0,strings.size());
    }
}