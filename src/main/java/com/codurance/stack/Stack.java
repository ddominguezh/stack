package com.codurance.stack;

import java.util.Arrays;

public class Stack {

    private int[] values;
    protected Stack(int capacity){
        this.values = new int[capacity];
        Arrays.fill(this.values, 0);
    }
    public static Stack create(int capacity) {
        return new Stack(capacity);
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push() {
        values[this.size()] = this.size()+1;
    }

    public int size() {
        int index = 0;
        while(values[index] != 0){
            index++;
        }
        return index;
    }

    public Integer peek() {
        if(this.isEmpty()){
            return null;
        }
        return this.values[this.size()-1];
    }

    public Integer pop() {
        Integer peek = this.peek();
        if(peek != null){
            this.values[this.size()-1] = 0;
        }
        return peek;
    }
    
}
