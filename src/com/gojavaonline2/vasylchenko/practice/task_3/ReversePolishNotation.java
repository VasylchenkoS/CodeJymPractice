package com.gojavaonline2.vasylchenko.practice.task_3;

/*Дано арифметичний вираз у вигляді Польського Інверсного запису.
Необхідно обчислити значення виразу і повернути його.

Вираз складається лише з цілих чисел і операцій +, -, *, /. Гарантується, що результат також ціне число.

StackReverse Polish notation*/

import java.util.Stack;
import java.util.StringTokenizer;

public class ReversePolishNotation {
    public int evaluate(String expression) {
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        StringTokenizer str = new StringTokenizer(expression);
        if (str.countTokens() == 0)
            return 0;
        String s1;
        while (str.hasMoreElements())
        {
            s1 = (String) str.nextElement();
                if (!operators.contains(s1)) stack.push(s1);
                else {
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    switch (operators.indexOf(s1)) {
                        case 0:
                            stack.push(String.valueOf(b + a));
                            break;
                        case 1:
                            stack.push(String.valueOf(b - a));
                            break;
                        case 2:
                            stack.push(String.valueOf(b * a));
                            break;
                        case 3:
                            stack.push(String.valueOf(b / a));
                            break;
                    }
                }
            }
        return Integer.valueOf(stack.pop());
    }
}