package com.codurance.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackTest {
    
    @Test
    public void throw_exception_when_create_stack_with_negative_values(){
        assertThrows(StackWithNegativeCapacityException.class, () -> Stack.create(-1));
    }

    @Test
    public void stack_is_empty(){
        Stack stack = Stack.create(3);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void stack_push(){
        Stack stack = Stack.create(3);
        stack.push();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void stack_push_catch_exception_when_we_exceed_capacity(){
        Stack stack = Stack.create(3);
        stack.push();
        stack.push();
        stack.push();
        stack.push();
    }

    @Test
    public void stack_get_size(){
        Stack stack = Stack.create(3);
        stack.push();
        assertEquals(1, stack.size());
        stack.push();
        assertEquals(2, stack.size());
    }

    @Test
    public void stack_peek(){
        Stack stack = Stack.create(3);
        stack.push();
        assertEquals(Integer.valueOf(1), stack.peek());
        stack.push();
        assertEquals(Integer.valueOf(2), stack.peek());
    }

    @Test
    public void stack_peek_return_null_when_stack_is_empty(){
        Stack stack = Stack.create(3);
        assertNull(stack.peek());
    }

    @Test
    public void stack_pop(){
        Stack stack = Stack.create(3);
        stack.push();
        stack.push();
        assertEquals(2, stack.size());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    public void stack_pop_return_null_when_stack_is_empty(){
        Stack stack = Stack.create(3);
        stack.push();
        assertEquals(Integer.valueOf(1), stack.pop());
        assertNull(stack.pop());
    }
}
