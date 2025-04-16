package Lektion16.Stack;

import java.util.ArrayList;

public class StackMethods implements stack{
    private ArrayList stack = new ArrayList();

    public void push(Object e) {
        this.stack.add(e);
    }

    public Object pop() {
        if(stack.isEmpty()){
            throw new RuntimeException("Stack is Null.");
        }else {
            return this.stack.remove(this.stack.size() - 1);
        }
    }
}
