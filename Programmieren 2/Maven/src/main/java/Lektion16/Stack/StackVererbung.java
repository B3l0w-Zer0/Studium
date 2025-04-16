package Lektion16.Stack;

import java.util.ArrayList;
import java.util.Stack;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList implements stack{
    public void push(Object e) {
        this.add(e);
    }

    public Object pop() {
        if(isEmpty()){
            throw new RuntimeException("Stack is Null.");
        }else {
            return this.remove(this.size() - 1);
        }
    }
}
