package com.droidsam.app;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static int atNthPosition(int nthPosition) {

        if (nthPosition == 0) {
            return 0;
        }

        List<Integer> fibonacciSequence = new ArrayList<>(List.of(0, 1));
        while (fibonacciSequence.size() <= nthPosition) {
            fibonacciSequence.add(fibonacciSequence.get(fibonacciSequence.size() - 1) + fibonacciSequence.get(fibonacciSequence.size() - 2));
        }

        return fibonacciSequence.get(fibonacciSequence.size() - 1);
    }
}
