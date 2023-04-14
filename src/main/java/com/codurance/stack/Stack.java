package com.codurance.stack;

import java.util.List;
import java.util.ArrayList;

public class Stack {

    private List<Integer> values;
    protected Stack(){
        this.values = new ArrayList<Integer>();
    }
    public static Stack create() {
        return new Stack();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push() {
        values.add(this.size()+1);
    }

    public int size() {
        return values.size();
    }
    public Object peek() {
        return null;
    }
    
}
