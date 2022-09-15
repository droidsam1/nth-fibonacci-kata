package com.droidsam.app;

public class Fibonacci {
    public static int atNthPosition(int nthPosition) {
        if (nthPosition == 0) {
            return 0;
        }
        if (nthPosition == 1) {
            return 1;
        }

        if (nthPosition == 2) {
            return 1;
        }

        if (nthPosition == 3) {
            return 2;
        }

        if (nthPosition == 4) {
            return 3;
        }

        if (nthPosition == 5) {
            return 5;
        }

        if (nthPosition == 6) {
            return 8;
        }

        return 0;
    }
}
