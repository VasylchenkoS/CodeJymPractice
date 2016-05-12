package com.gojavaonline2.vasylchenko.practice.task_3;

import org.junit.Assert;
import org.junit.Test;

public class LongestStabilityPeriodTest {

    @Test
    public void testCount() throws Exception {
        int input[] = {901, 901, 901, 902, 902, 903, 903, 902, 902, 901, };
        int expected = 6;
        Assert.assertEquals(expected, new LongestStabilityPeriod().count(input));
    }

    @Test
    public void testCount1() throws Exception {
        int input[] = {900, 901, 902,};
        int expected = 2;
        Assert.assertEquals(expected, new LongestStabilityPeriod().count(input));
    }

    @Test
    public void testCount2() throws Exception {
        int input[] = {900, 900, 900, 901, 902, 902, 903, 903,};
        int expected = 4;
        Assert.assertEquals(expected, new LongestStabilityPeriod().count(input));
    }
    @Test
    public void testCount3() throws Exception {
        int input[] = {902, 902, 901, 902, 902, 903, 902, 902, 901, 902, 901, 901, 902, 903,};
        int expected = 7;
        Assert.assertEquals(expected, new LongestStabilityPeriod().count(input));
    }
}