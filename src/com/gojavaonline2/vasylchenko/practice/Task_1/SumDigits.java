package com.gojavaonline2.vasylchenko.practice.task_1;

//Обчислити суму цифр числа.
//Наприклад сума цифр числа 123 дорівнює  6.
public class SumDigits {
    public int sum(int number) {
        int result = 0;
        String s = String.valueOf(number);
        char[] arrayList = s.toCharArray();
        for (char anArrayList : arrayList) {
            if (Character.isDigit(anArrayList))
                result += Character.getNumericValue(anArrayList);
        }
        return result;
    }
}