package com.gojavaonline2.vasylchenko.practice.task_2;

import org.junit.Assert;
import org.junit.Test;

public class PositiveAverageNumberTest {

    @Test
    public void testAverage() throws Exception {
        int input1 = 7;
        int input2 = -5;
        int result = 1;
        Assert.assertEquals(result, new PositiveAverageNumber().average(input1,input2));
    }
    @Test
    public void testAverage1() throws Exception {
        int input1 = -7;
        int input2 = -5;
        int result = 6;
        Assert.assertEquals(result, new PositiveAverageNumber().average(input1,input2));
    }
}