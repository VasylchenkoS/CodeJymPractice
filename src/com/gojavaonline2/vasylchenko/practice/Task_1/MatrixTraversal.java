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
        if ((input.length == 1)&&(input[0].length == 0)) {
            int a[] = new int[]{input[0][0]};
            return a;
        }
        int a = input.length * input[0].length;
        int result[] = new int[a];

        int n = input.length;
        int m = input[0].length;
        int f = n - 1;
        int w = m - 1;
        int c = 0;
        int i = 0;
        int j = 0;
        int p = 0;

        while (c != n * m - 1) {
            while (j < w) {
                result[c++] = input[i][j];
                j++;
            }
            while (i < f) {
                result[c++] = input[i][j];
                i++;
            }
            while (j > p) {
                result[c++] = input[i][j];
                j--;
            }

            //Здесь уменьшаем количество шагов в каждом цикле по строкам, столбцам и по количеству проходимых клеток клеток
            f--;
            w--;
            p++;
            while (i > p) {
                result[c++] = input[i][j];
                i--;
            }
        }
        //Условие добавления последнего элемента
        if (c == n * m - 1) {
            result[c++] = input[i][j];
        }
        return result;
    }
}
