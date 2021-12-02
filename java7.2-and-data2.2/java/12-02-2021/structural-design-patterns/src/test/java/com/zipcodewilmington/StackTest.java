package com.zipcodewilmington;

import org.junit.Test;

import java.util.List;
import java.util.Stack;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/2/21 4:16 PM
 */
public class StackTest {
    @Test
    public void test() {
        // given
        List<String> stack = new Stack<>();

        // when
        String objectAtIndex5 = stack.get(5);

        // then
        throw new RuntimeException("This is bad");
    }
}
