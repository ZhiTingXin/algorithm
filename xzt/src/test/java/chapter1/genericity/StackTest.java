package chapter1.genericity;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack<String> strings = new Stack<String>();
    @Test
    public void testPop(){
        strings.push("adadad");
        assertEquals("adadad",strings.pop());
    }

    @Test
    public void testSize(){
        strings.push("abc");
        assertEquals(1,strings.size());
    }

    @Test
    public void  testIter(){
        strings.push("abc");
        strings.push("bac");
        for (String s:strings){
            System.out.println(s);
        }
    }

}