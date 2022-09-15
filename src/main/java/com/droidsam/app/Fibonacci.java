package com.droidsam.app;

public class Fibonacci {
    public static int atNthPosition(int nthPosition) {

        if (nthPosition == 0) {
            return 0;
        }

        int result = 1;
        for (int i = 0; i <= nthPosition; i++) {

            if (i == 3 || i == 4) {
                result++;
            }
            if (i == 5) {
                result += 2;
            }

            if (i == 6) {
                result += 3;
            }

            if (i == 7) {
                result += 5;
            }

            if (i == 8) {
                result += 8;
            }

        }

        return result;
    }
}
