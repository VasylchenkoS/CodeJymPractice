package com.gojavaonline2.vasylchenko.practice.task_3;

/*Реалізуйте структуру даних  - Бінарна Купа (Binary Heap).
Конструктор проймає один параметр size.
Методи insert(int) що працює за O(logN) і poll(),
який видаляє і повертає максимальне число з купи і також працює за O(logN).*/

import java.util.TreeMap;

public class BinaryHeap {

    private TreeMap<Integer, Integer> integerTreeMap = new TreeMap<>();

    public BinaryHeap(int size) {

    }

    public void insert(int val) {
        integerTreeMap.put(val, val);
    }

    public int poll() {
        if (integerTreeMap.size() > 0) {
            int max = integerTreeMap.lastKey();
            integerTreeMap.remove(max);
            return max;
        }
        return 0;
    }
}
