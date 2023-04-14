package com.codurance.stack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackTest {
    
    @Test
    public void stack_is_empty(){
        Stack stack = Stack.create();
        assertTrue(stack.isEmpty());
    }
}
