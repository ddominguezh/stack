package com.codurance.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
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

    @Test
    public void stack_get_size(){
        Stack stack = Stack.create();
        stack.push();
        assertEquals(1, stack.size());
        stack.push();
        assertEquals(2, stack.size());
    }

    @Test
    public void stack_peek(){
        Stack stack = Stack.create();
        stack.push();
        assertEquals(Integer.valueOf(1), stack.peek());
        stack.push();
        assertEquals(Integer.valueOf(2), stack.peek());
    }

    @Test
    public void stack_peek_get_null_when_stack_is_empty(){
        Stack stack = Stack.create();
        assertNull(stack.peek());
    }
}
