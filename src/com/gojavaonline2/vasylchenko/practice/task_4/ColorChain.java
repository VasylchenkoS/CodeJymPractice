package com.gojavaonline2.vasylchenko.practice.task_4;

/*Дано ланки трьох кольорів: білого 1 м завдовжки, жовтого - 2 м
і червоного - 3 м.
Скількома способами можна зібрати, з них, ланцюжок довжиною  N.
Кількість наявних ланок кожного кольору вважати бескінечною.*/
public class ColorChain {
    private static final int[] USE_CHAINS = {1, 2, 3};
    private static int result;

    public int count(int N) {
        result = 0;
        getLinksCount(N, 0);
        return result;
    }

    private void getLinksCount(int inputValue, int length) {
        while (length <= inputValue)
            getLinksCountDP(inputValue, new int[length++], 0);
    }

    private void getLinksCountDP(int inputValue, int[] intermediateResults, int depth) {
        if (depth == intermediateResults.length) {
            if (getSum(intermediateResults) == inputValue) {
                result++;
//                System.out.println(Arrays.toString(intermediateResults));
            } else {
                for (int j : USE_CHAINS) {
                    intermediateResults[depth] = j;
                    getLinksCountDP(inputValue, intermediateResults, depth + 1);
                }
            }
        }
    }

    private static int getSum(int[] temp) {
        int sum = 0;
        for (int i : temp)
            sum += i;
        return sum;
    }
}
