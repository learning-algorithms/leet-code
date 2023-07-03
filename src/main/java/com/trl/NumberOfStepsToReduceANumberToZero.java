package com.trl;

public class NumberOfStepsToReduceANumberToZero {

    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

    public static int numberOfSteps(int num) {
        int counterOfSteps = 0;

        if (num == 0) {
            return 0;
        }

        do {
            if (0 == num % 2) {
                num = num / 2;
                counterOfSteps++;
            } else if (1 == num % 2) {
                num--;
                counterOfSteps++;
            }
        } while (num > 0);

        return counterOfSteps;
    }
}
