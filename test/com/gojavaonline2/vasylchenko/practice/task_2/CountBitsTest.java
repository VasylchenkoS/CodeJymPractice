package com.gojavaonline2.vasylchenko.practice.task_2;

import org.junit.Assert;
import org.junit.Test;

public class CountBitsTest {

    @Test
    public void testCount() throws Exception {
        int input = 13;
        int result = 3;
        Assert.assertEquals(result, new CountBits().count(input));

    }
    @Test
    public void testCount1() throws Exception {
        int input = 1;
        int result = 1;
        Assert.assertEquals(result, new CountBits().count(input));
    }
    @Test
    public void testCount2() throws Exception {
        int input = 1;
        int result = 1;
        Assert.assertEquals(result, new CountBits().count(input));
    }
    @Test
    public void testCount3() throws Exception {
        int input = -1;
        int result = 32;
        Assert.assertEquals(result, new CountBits().count(input));
    }
    @Test
    public void testCount4() throws Exception {
        int input = -2147483648;
        int result = 1;
        Assert.assertEquals(result, new CountBits().count(input));
    }
}