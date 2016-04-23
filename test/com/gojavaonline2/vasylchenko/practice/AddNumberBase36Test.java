package com.gojavaonline2.vasylchenko.practice;

import org.junit.Assert;
import org.junit.Test;

public class AddNumberBase36Test {

    @Test
    public void testAdd() throws Exception {
        String input1 = "9";
        String input2 = "1";
        String expected = "a";
        Assert.assertEquals(expected, new AddNumberBase36().add(input1,input2));
    }

    @Test
    public void testAdd1() throws Exception {
        String input1 = "z";
        String input2 = "1";
        String expected = "10";
        Assert.assertEquals(expected, new AddNumberBase36().add(input1, input2));
    }

    @Test
    public void testAdd3() throws Exception {
        String input1 = "10";
        String input2 = "z";
        String expected = "1z";
        Assert.assertEquals(expected, new AddNumberBase36().add(input1, input2));
    }
    @Test
    public void testAdd4() throws Exception {
        String input1 = "vjz5";
        String input2 = "q3N";
        String expected = "wa2s";
        Assert.assertEquals(expected, new AddNumberBase36().add(input1, input2));
    }
    @Test
    public void testAdd2() throws Exception {
        String input1 = "zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5";
        String input2 = "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N";
        String expected = "10g7vy7xrkildxnlpkvzwxy0uzwyyzx6kiwixx24xahmjyw2s";
        Assert.assertEquals(expected, new AddNumberBase36().add(input1, input2));
    }
}