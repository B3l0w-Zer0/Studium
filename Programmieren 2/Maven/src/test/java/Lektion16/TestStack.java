package Lektion16;

import Lektion16.Stack.StackMethods;
import Lektion16.Stack.StackVererbung;
import Lektion16.Stack.stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

public class TestStack {

    @Test
    public void testStackMethods() {
        StackMethods SM = new StackMethods();
        SM.push(3);
        SM.push(1);
        assertEquals(1, SM.pop());
        assertEquals(3, SM.pop());
    }

    @Test
    public void testStackVererbung() {
        StackVererbung SV = new StackVererbung();
        SV.push(3);
        SV.push(1);
        assertEquals(1, SV.pop());
        assertEquals(3, SV.pop());
    }

    @Test
    public void testNull1(){
        try{
            StackVererbung SV1 = new StackVererbung();
            SV1.pop();
            fail("Stack is Null.");}
        catch(RuntimeException e){
            assertEquals("Stack is Null.", e.getMessage());
        }
    }

    @Test
    public void testNull2(){
        try{
            StackMethods SM1 = new StackMethods();
            SM1.pop();
            fail("Stack is Null.");}
        catch(RuntimeException e){
            assertEquals("Stack is Null.", e.getMessage());
        }
    }
}