package com.gojavaonline2.vasylchenko.practice.Task_1;

//Обчислити суму цифр числа.
//Наприклад сума цифр числа 123 дорівнює  6.
public class SumDigits {
    public int sum(int number) {
        int result = 0;
        String s = String.valueOf(number);
        char[] arrayList = s.toCharArray();
        for (int a = 0; a < arrayList.length; a++) {
            if (Character.isDigit(arrayList[a]))
                result += Character.getNumericValue(arrayList[a]);
        }
        return result;
    }
}