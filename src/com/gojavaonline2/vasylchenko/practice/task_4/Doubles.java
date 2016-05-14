package com.gojavaonline2.vasylchenko.practice.task_4;

/*Дано рядок, що представляє певне чило. Необхідно повернути число.
Якщо це неможливо, повернути null
Наприклад:
"-2.e10"
"+.3"
".e2" повертає null*/
public class Doubles {
    public Double parse(String s) {
        Double result = null;
        try {
            result = Double.parseDouble(s);
        } catch (NumberFormatException e){}
        return result;
    }
}
