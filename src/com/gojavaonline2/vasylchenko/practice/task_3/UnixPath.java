package com.gojavaonline2.vasylchenko.practice.task_3;

/*Условие: Дано полный путь к файлу в Unix системе.
Например, /home/../var/./lib//file.txt. Необходимо вернуть упрощенный вариант - (/var/lib/file.txt)*/

import java.util.Deque;
import java.util.LinkedList;

public class UnixPath {
    public String simplify(String input) {
        StringBuilder result = new StringBuilder();
        Deque<String> pathDeque = new LinkedList<>();
        String[] path = input.split("/");
        for (String current : path) {
            if (current.equals("..")) {
                if (!pathDeque.isEmpty())
                    pathDeque.pop();
            } else if (!(current.equals("") || current.equals(".")))
                pathDeque.push(current);
        }
        if (pathDeque.isEmpty() && !input.isEmpty())
            return "/";
        else while (!pathDeque.isEmpty()) {
            result.append("/").append(pathDeque.removeLast());
        }
        return result.toString();
    }
}
