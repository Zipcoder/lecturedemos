package com.zipcodewilmington;

import java.util.Stack;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/2/21 4:53 PM
 */
public class StackAdapter<SomeType> {
    private Stack<SomeType> stack;

    public StackAdapter(Stack<SomeType> stack) { // dependency injection
        this.stack = stack;
    }

    public StackAdapter(StackFacade<SomeType> stackFacade) {
        this(new Stack<>());
        while(!stackFacade.isEmpty()) {
            stack.push(stackFacade.pop());
        }
    }

    public StackAdapter() {
        this(new Stack<>());
    }

    public StackFacade<SomeType> getStackFacade() {
        return new StackFacade<>(stack);
    }

    public Stack<SomeType> getStack() {
        return stack;
    }
}
