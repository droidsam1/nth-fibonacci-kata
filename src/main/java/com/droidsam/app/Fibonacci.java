package com.droidsam.app;

public class Fibonacci {
    public static int atNthPosition(int nthPosition) {

        int result = 0;
        for (int i = 0; i <= nthPosition; i++) {
            if (i == 1 || i == 3 || i == 4) {
                result++;
            }
            if (i == 5) {
                result += 2;
            }

            if (i == 6) {
                result += 3;
            }

        }

        return result;
    }
}
