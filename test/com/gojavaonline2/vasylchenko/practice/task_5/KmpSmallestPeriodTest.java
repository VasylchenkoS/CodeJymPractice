package com.gojavaonline2.vasylchenko.practice.task_5;

import junit.framework.Assert;
import org.junit.Test;

public class KmpSmallestPeriodTest {

    @Test
    public void testFindSmalletstPeriod() throws Exception {
        String input = "abcabcabcabc";
        String expected = "abc";
        Assert.assertEquals(expected, new KmpSmallestPeriod().findSmalletstPeriod(input));
    }
}