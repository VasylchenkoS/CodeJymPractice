package com.gojavaonline2.vasylchenko.practice.task_1;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    @Test(timeout = 100)
    public void testMax1() throws Exception {
        int start[] = {1,2,3,4,5,10,-5};
        Assert.assertEquals(10, new FindMaxNumber().max(start));
    }

    @Test(timeout = 100)
    public void testMax2() throws Exception {
        int start[] = {-1, -2, -5, -3, };
        Assert.assertEquals(-1, new FindMaxNumber().max(start));
    }
}