package com.gojavaonline2.vasylchenko.practice.Task_1;

import org.junit.*;
import org.junit.Test;

public class MatrixTraversalTest {

    @Test
    public void testPrint() throws Exception {
        int input[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        String result = "1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 ";
        String inputString = "";
        for (int i : new MatrixTraversal().print(input)) {
            inputString += i + " ";
        }
        Assert.assertEquals(result, inputString);
    }

    @Test
    public void testPrint1() throws Exception {
        int input[][] = {{}};
        String result = " ";
        String inputString = "";
        for (int i : new MatrixTraversal().print(input)) {
            inputString += i + " ";
        }
        Assert.assertEquals(result, inputString);
    }
}