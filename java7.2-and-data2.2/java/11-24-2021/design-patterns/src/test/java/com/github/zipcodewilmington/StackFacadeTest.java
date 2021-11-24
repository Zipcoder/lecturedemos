package com.github.zipcodewilmington;

import com.github.zipcodewilmington.utils.StackFacade;
import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/24/21 10:39 AM
 */
public class StackFacadeTest {
    @Test
    public void stackFacadePush() {
        // given
        StackFacade<String> stackFacade = new StackFacade<>();
        Assert.assertTrue(stackFacade.isEmpty());
        String expectedPop = "Hello world";

        // when
        stackFacade.push(expectedPop);

        // then
        Assert.assertEquals(expectedPop, stackFacade.pop());
    }

    @Test
    public void stackPush() {
        // given
        Stack<String> stack = new Stack<>();
        Assert.assertTrue(stack.isEmpty());
        String expectedPop = "Hello world";

        // when
        stack.add(expectedPop);

        // then
        Assert.assertEquals(expectedPop, stack.get(0));
    }
}
