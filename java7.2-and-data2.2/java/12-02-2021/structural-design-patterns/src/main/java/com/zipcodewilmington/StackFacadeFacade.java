package com.zipcodewilmington;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/2/21 4:38 PM
 */
public class StackFacadeFacade {
    StackFacade stackFacade = new StackFacade();
    public void push(Object o) {
        stackFacade.push(o);
    }
}
