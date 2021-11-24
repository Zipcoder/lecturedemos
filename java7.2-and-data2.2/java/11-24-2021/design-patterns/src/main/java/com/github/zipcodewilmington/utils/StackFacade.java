package com.github.zipcodewilmington.utils;

import java.util.Stack;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 10:35 AM
 */
public class StackFacade<SomeType> {
    private Stack<SomeType> stack;

    public StackFacade() {
        this(new Stack<>());
    }

    public StackFacade(Stack<SomeType> stack) {
        this.stack = stack;
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public SomeType peek() {
        return stack.peek();
    }

    public SomeType pop() {
        return stack.pop();
    }

    public void push(SomeType someObject) {
        stack.push(someObject);
    }
}
