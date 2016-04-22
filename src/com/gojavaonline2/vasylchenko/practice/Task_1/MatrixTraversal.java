package com.gojavaonline2.vasylchenko.practice.Task_1;

//Обійти матрицю по спіралі і записати всі числа в одмірний масив.
//        Для матриці
//        [[1,   2,  3,  4],
//        [5,   6,  7,  8]
//        [9,  10, 11, 12]
//        [13, 14, 15, 16]]
//        вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]


public class MatrixTraversal {

    public int[] print(int[][] input) {
        int a = input.length * input[0].length;
        int result[] = new int[a];
        int rowNum = input.length;
        int colNum = input[0].length;
        int loopOut = 0, curAdd = 0;
        int j = 0, k = 0;

        while (loopOut < a) {
            k++;
            for (j = k - 1; (j < colNum - k + 1) && (loopOut < a); j++) {
                result[curAdd++] = input[k - 1][j];
                loopOut++;
            }
            for (j = k; j < (rowNum - k + 1) && (loopOut < a); j++) {
                result[curAdd++] = input[j][colNum - k];
                loopOut++;
            }
            for (j = colNum - k - 1; (j >= k - 1) && (loopOut < a); j--) {
                result[curAdd++] = input[rowNum - k][j];
                loopOut++;
            }
            for (j = rowNum - k - 1; (j >= k) && (loopOut < a); j--) {
                result[curAdd++] = input[j][k - 1];
                loopOut++;
            }
        }
        return result;
    }
}