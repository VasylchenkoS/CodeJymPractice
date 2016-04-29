package com.gojavaonline2.vasylchenko.practice.task_1;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSnakeTraversalTest {

    @Test (timeout = 100)
    public void testPrint() throws Exception {
        int input[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        String result = "1 4 7 8 5 2 3 6 9 ";
        String inputString = "";
        for (int i : new MatrixSnakeTraversal().print(input)) {
            inputString += i + " ";
        }
        Assert.assertEquals(result, inputString);
    }

    @Test (timeout = 100)
    public void testPrint1() throws Exception {
        int input[][] = {{1, 2, },
                {3, 4,}};
        String result = "1 3 4 2 ";
        String inputString = "";
        for (int i : new MatrixSnakeTraversal().print(input)) {
            inputString += i + " ";
        }
        Assert.assertEquals(result, inputString);
    }
}