package com.codurance.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackTest {
    
    @Test
    public void stack_is_empty(){
        Stack stack = Stack.create();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void stack_push(){
        Stack stack = Stack.create();
        stack.push();
        assertFalse(stack.isEmpty());
    }
}
