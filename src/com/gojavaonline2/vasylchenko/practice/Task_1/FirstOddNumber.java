package com.gojavaonline2.vasylchenko.practice.Task_1;

//Знайти перше непарне число і повернути його індекс.
//Якщо такого немає, повернути -1
public class FirstOddNumber {
    public int find(int[] input) {
        int result = -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i]%2>0) {
                result = i;
                break;
            }
        }
        return result;
    }
}