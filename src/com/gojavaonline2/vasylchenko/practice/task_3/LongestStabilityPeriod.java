package com.gojavaonline2.vasylchenko.practice.task_3;

/*Дано масив чисел в якому знаходяться значення ВВП за кожен місяць в мільярдах доларів США.
Необхідно знайти найдовший період стабільності.
Період стабільності - період часу де всі значення ВВП попарно відрізняються один від одного максимум на 1.
Повернути кількість місяців.*/

public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int result = 0;
        if (gdp.length <= 1)
            return gdp.length;
        for (int i = 0; i < gdp.length; i++) {
            int j = i, sum = 0;
            int minVal = gdp[i], maxVal = gdp[i];
            boolean changeStart = true;
            if (result >= gdp.length - i)
                return result;
            while (j < gdp.length) {
                if (changeStart && gdp[i] != gdp[j]){
                    changeStart = false;
                    i = j - 1;
                }
                minVal = minVal > gdp[j] && Math.abs(maxVal - gdp[j]) <= 1 ? gdp[j] : minVal;
                maxVal = maxVal < gdp[j] && Math.abs(gdp[j] - minVal) <= 1 ? gdp[j] : maxVal;
                if (gdp[j] <= maxVal && gdp[j] >= minVal)
                    sum++;
                else {
                    result = result < sum ? sum : result;
                    break;
                }
                j++;
            }
        }
        return result;
    }
}
