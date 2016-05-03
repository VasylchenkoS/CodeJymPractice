package com.gojavaonline2.vasylchenko.practice.task_2;

import org.junit.Assert;
import org.junit.Test;

public class AverageNumberTest {

    @Test
    public void testAverage() throws Exception {
        int input1 = 4;
        int input2 = 6;
        int result = 5;
        Assert.assertEquals(result, new AverageNumber().average(input1,input2));
    }
    @Test
    public void testAverage1() throws Exception {
        int input1 = -4;
        int input2 = -7;
        int result = -5;
        Assert.assertEquals(result, new AverageNumber().average(input1,input2));
    }
    @Test
    public void testAverage2() throws Exception {
        int input1 = -4;
        int input2 = 7;
        int result = 1;
        Assert.assertEquals(result, new AverageNumber().average(input1,input2));
    }
    @Test
    public void testAverage3() throws Exception {
        int input1 = -7;
        int input2 = -5;
        int result = -6;
        Assert.assertEquals(result, new AverageNumber().average(input1,input2));
    }
    @Test
    public void testAverage4() throws Exception {
        int input1 = -2147483648;
        int input2 = -2;
        int result = -1073741825;
        Assert.assertEquals(result, new AverageNumber().average(input1,input2));
    }
    @Test
    public void testAverage5() throws Exception {
        int input1 = 0;
        int input2 = 0;
        int result = 0;
        Assert.assertEquals(result, new AverageNumber().average(input1,input2));
    }
}