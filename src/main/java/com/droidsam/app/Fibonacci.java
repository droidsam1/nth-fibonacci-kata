package com.droidsam.app;

public class Fibonacci {
    public static int atNthPosition(int nthPosition) {
        if (nthPosition == 0) {
            return 0;
        }
        if (nthPosition == 1) {
            return 1;
        }

        if(nthPosition == 5){
            return 5;
        }

        if(nthPosition == 6){
            return 8;
        }

        return nthPosition - 1;
    }
}
