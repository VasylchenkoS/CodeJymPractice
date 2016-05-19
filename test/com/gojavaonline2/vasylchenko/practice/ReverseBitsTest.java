package com.gojavaonline2.vasylchenko.practice;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void testReverse() throws Exception {
        int input = 1;
        int expected = -2147483648 ;
        Assert.assertEquals(expected, new ReverseBits().reverse(input));
    }
    @Test
    public void testReverse1() throws Exception {
        int input = -2147483647;
        int expected = -2147483648 ;
        Assert.assertEquals(expected, new ReverseBits().reverse(input));
    }
}