package chapter1.test;

import chapter1.genericity.StackDIY;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackDIYTest {


    private  StackDIY<String> stringStackDIY = new StackDIY<String>();

    @Test
    public void getNum() {
        stringStackDIY.push("abc");
        stringStackDIY.getNum(0);
        stringStackDIY.pop();
    }

    @Test
    public void isEmpty() {
        assertTrue(stringStackDIY.isEmpty());
    }

    @Test
    public void push() {
        stringStackDIY.push("1235556ad");
        stringStackDIY.push("dadlkah");
        System.out.println(stringStackDIY.size());
        for(String sm:stringStackDIY){
            System.out.println(sm);
        }
    }

    @Test
    public void pop() {
    }

}