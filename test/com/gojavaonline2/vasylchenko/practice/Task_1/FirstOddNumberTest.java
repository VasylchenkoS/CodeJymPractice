package com.gojavaonline2.vasylchenko.practice.task_1;

import org.junit.*;
import org.junit.Test;

public class FirstOddNumberTest {

    @Test (timeout = 100)
    public void testFind() throws Exception {
        int input[] = {2,4,3,5};
        Assert.assertEquals(2,new FirstOddNumber().find(input));

    }
    @Test (timeout = 100)
    public void testFind1() throws Exception {
        int input[] = {4, 44, 4, 2, 8, 4, };
        Assert.assertEquals(-1,new FirstOddNumber().find(input));

    }
    @Test (timeout = 100)
    public void testFind2() throws Exception {
        int input[] = {};
    Assert.assertEquals(-1,new FirstOddNumber().find(input));
    }
}