package com.gojavaonline2.vasylchenko.practice.task_4;

import junit.framework.Assert;
import org.junit.Test;

public class ColorChainTest {

    @Test
    public void testCount() throws Exception {
        int input = 3;
        int expected = 4;
        Assert.assertEquals(expected, new ColorChain().count(input));
    }
    @Test
    public void testCount1() throws Exception {
        int input = 10;
        int expected = 274;
        Assert.assertEquals(expected, new ColorChain().count(input));
    }
    @Test
    public void testCount2() throws Exception {
        int input = 15;
        int expected = 5768;
        Assert.assertEquals(expected, new ColorChain().count(input));
    }
    @Test
    public void testCount3() throws Exception {
        int input = 17;
        int expected = 19513;
        Assert.assertEquals(expected, new ColorChain().count(input));
    }
    @Test
    public void testCount4() throws Exception {
        int input = 18;
        int expected = 35890;
        Assert.assertEquals(expected, new ColorChain().count(input));
    }
    @Test
    public void testCount5() throws Exception {
        int input = 19;
        int expected = 66012;
        Assert.assertEquals(expected, new ColorChain().count(input));
    }
    @Test
    public void testCount6() throws Exception {
        int input = 20;
        int expected = 121415;
        Assert.assertEquals(expected, new ColorChain().count(input));
    }
}