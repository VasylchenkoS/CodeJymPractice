package com.gojavaonline2.vasylchenko.practice.Task_1;

import org.junit.*;
import org.junit.Test;

public class JoinCharactersTest {

    @Test (timeout = 100)
    public void testJoin() throws Exception {
        char[] input = {'1','2','3'};
        Assert.assertEquals(123,new JoinCharacters().join(input));
    }
}