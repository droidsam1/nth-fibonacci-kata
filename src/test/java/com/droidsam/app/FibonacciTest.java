package com.droidsam.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void shouldReturnZeroWhenPositionIsZero() {
        assertEquals(0, Fibonacci.atNthPosition(0));
    }

    @Test
    public void shouldReturnOneWhenPositionIsOne() {
        assertEquals(1, Fibonacci.atNthPosition(1));
    }
}
