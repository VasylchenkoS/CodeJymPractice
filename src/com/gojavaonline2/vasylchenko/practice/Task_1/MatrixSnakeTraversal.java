package com.gojavaonline2.vasylchenko.practice.task_1;

//Обійти матрицю "змійкою" і повернути всі числа в одномірному масиві.
//        Наприклад:
//        Для
//        [[ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]]
//        повернути
//        [1, 4, 7, 8, 5, 2, 3, 6, 9]

public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        if (input.length == 0)
            return new int[]{};
        int a = input.length * input[0].length;
        int result[] = new int[a];
        int loopOut = 0;
        int curRow = 0;
        int curCol = 0;
        int curAdd = 0;
        while (loopOut < a) {
            while ((curCol < input.length) && (loopOut < a)) {
                result[curAdd++] = input[curCol++][curRow];
                loopOut++;
            }
            curRow++;
            while ((curCol > 0) && (loopOut < a)) {
                result[curAdd++] = input[--curCol][curRow];
                loopOut++;
            }
            curRow++;
        }
        return result;
    }
}
