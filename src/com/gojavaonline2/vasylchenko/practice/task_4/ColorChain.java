package com.gojavaonline2.vasylchenko.practice.task_4;

/*Дано ланки трьох кольорів: білого 1 м завдовжки, жовтого - 2 м
і червоного - 3 м.
Скількома способами можна зібрати, з них, ланцюжок довжиною  N.
Кількість наявних ланок кожного кольору вважати бескінечною.*/
public class ColorChain {

    public int count(int N) {
        if (N <= 2) return N;
        if (N == 3) return 4;
        return count(N - 1) + count(N - 2) + count(N - 3);
    }
}
//        int[] intermediateResults = new int[N + 1];
//        return getStripCountDP(N, intermediateResults);

//    private int getStripCountDP(int N, int[] intermediateResults) {
//
//        if (N == 0 || N == 1 || N == 2) {
//            intermediateResults[N] = N;
//            return N;
//        }
//        if (N == 3) {
//            intermediateResults[N] = 4;
//            return 4;
//        }
//
//        int oneStripLength = getStripCountDP(N - 1, intermediateResults);
//        int twoStripLength = getStripCountDP(N - 2, intermediateResults);
//        int threeStripLength = getStripCountDP(N - 3, intermediateResults);
//
//        int result = oneStripLength + twoStripLength + threeStripLength;
//        intermediateResults[N] = result;
//        return result;
//    }

