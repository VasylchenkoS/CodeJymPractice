package com.gojavaonline2.vasylchenko.practice.task_2;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void testAdd() throws Exception {
        String input1 = "101";
        String input2 = "100";
        String expected = "1001";
        Assert.assertEquals(expected, new AddBinary().add(input1, input2));
    }
    @Test
    public void testAdd1() throws Exception {
        String input1 = "10000000000000000000000000000000";
        String input2 = "10000000000000000000000000000000";
        String expected = "100000000000000000000000000000000";
        Assert.assertEquals(expected, new AddBinary().add(input1, input2));
    }
    @Test
    public void testAdd2() throws Exception {
        String input1 = "0";
        String input2 = "1";
        String expected = "1";
        Assert.assertEquals(expected, new AddBinary().add(input1, input2));
    }
    @Test
    public void testAdd3() throws Exception {
        String input1 = "1";
        String input2 = "11";
        String expected = "100";
        Assert.assertEquals(expected, new AddBinary().add(input1, input2));
    }
    @Test
    public void testAdd4() throws Exception {
        String input1 = "1111111111111111111111111111111";
        String input2 = "1111111111111111111111111111111";
        String expected = "11111111111111111111111111111110";
        Assert.assertEquals(expected, new AddBinary().add(input1, input2));
    }
    @Test
    public void testAdd5() throws Exception {
        String input1 = Integer.toBinaryString(Integer.MIN_VALUE);
        String input2 = Integer.toBinaryString(Integer.MAX_VALUE);
        String expected = Integer.toBinaryString(Integer.MIN_VALUE + Integer.MAX_VALUE);
        Assert.assertEquals(expected, new AddBinary().add(input1, input2));
    }
    @Test
    public void testAdd6() throws Exception {
        String input1 = "0";
        String input2 = "1";
        String expected = "1";
        Assert.assertEquals(expected, new AddBinary().add(input1, input2));
    }
}