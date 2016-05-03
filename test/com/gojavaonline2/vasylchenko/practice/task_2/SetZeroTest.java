package com.gojavaonline2.vasylchenko.practice.task_2;

import org.junit.Assert;
import org.junit.Test;

public class SetZeroTest {

    @Test
    public void testSet() throws Exception {
            int inputNum = -1;
            int inputI = 31;
            int expected = -1073741825 ;
            Assert.assertEquals(expected, new SetZero().set(inputNum,inputI));
    }
    @Test
    public void testSet1() throws Exception {
            int inputNum = 6;
            int inputI = 2;
            int expected = 4 ;
            Assert.assertEquals(expected, new SetZero().set(inputNum,inputI));
    }
    @Test
    public void testSet2() throws Exception {
        int inputNum = Integer.MIN_VALUE;
        int inputI = 31;
        int expected = -2147483648 ;
        Assert.assertEquals(expected, new SetZero().set(inputNum,inputI));
    }
}