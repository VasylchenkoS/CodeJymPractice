package com.gojavaonline2.vasylchenko.practice.task_1;

import org.junit.*;
import org.junit.Test;

public class JoinCharactersTest {

    @Test (timeout = 100)
    public void testJoin() throws Exception {
        char[] input = {'1','2','3'};
        Assert.assertEquals(123,new JoinCharacters().join(input));
    }
    @Test (timeout = 100)
    public void testJoin1() throws Exception {
        char[] input = {};
        Assert.assertEquals(0 ,new JoinCharacters().join(input));
    }
    @Test (timeout = 100)
    public void testJoin2() throws Exception {
        char[] input = {'a'};
        Assert.assertEquals(0,new JoinCharacters().join(input));
    }
}