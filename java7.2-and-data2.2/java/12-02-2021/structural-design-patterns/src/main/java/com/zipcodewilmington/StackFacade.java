package com.zipcodewilmington;

import java.util.Stack;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/2/21 4:20 PM
 */
public class StackFacade<SomeType> {
    private Stack<SomeType> stack;

    public StackFacade(Stack<SomeType> stack) { // used for dependency injection
        this.stack = stack;
    }

    public StackFacade() { // nullary implementation
        this(new Stack<>());
    }

    public SomeType pop() {
        return stack.pop();
    }

    public SomeType peek() {
        return stack.peek();
    }

    public void push(SomeType someObject) {
        stack.push(someObject);
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }
}
