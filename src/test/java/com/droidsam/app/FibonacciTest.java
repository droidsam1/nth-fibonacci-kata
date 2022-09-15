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

    @Test
    public void shouldReturnOneWhenPositionIsTwo() {
        assertEquals(1, Fibonacci.atNthPosition(2));
    }

    @Test
    public void shouldReturnTwoWhenPositionIsThree() {
        assertEquals(2, Fibonacci.atNthPosition(3));
    }

    @Test
    public void shouldReturnThreeWhenPositionIsFour() {
        assertEquals(3, Fibonacci.atNthPosition(4));
    }

    @Test
    public void shouldReturnFiveWhenPositionIsFive() {
        assertEquals(5, Fibonacci.atNthPosition(5));
    }

    @Test
    public void shouldReturnEightWhenPositionIsSix() {
        assertEquals(8, Fibonacci.atNthPosition(6));
    }

    @Test
    public void shouldReturnThirteenWhenPositionIsSeven() {
        assertEquals(13, Fibonacci.atNthPosition(7));
    }

    @Test
    public void shouldReturnTwentyOneWhenPositionIsEight() {
        assertEquals(21, Fibonacci.atNthPosition(8));
    }

    @Test
    public void shouldReturnThirtyFourWhenPositionIsNine() {
        assertEquals(34, Fibonacci.atNthPosition(9));
    }

}
