package ru.crafts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibTest {
    @Test
    public void returnZeroForZero() {
        long result = Fib.getFibonacciNumber(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void returnOneForOne() {
        long result = Fib.getFibonacciNumber(1);
        Assertions.assertEquals(1, result);
    }


    @Test
    public void returnOneForTwo() {
        long result = Fib.getFibonacciNumber(2);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void returnTwoForThree() {
        long result = Fib.getFibonacciNumber(3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void returnThreeForFour() {
        long result = Fib.getFibonacciNumber(4);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void returnSmthFor46() {
        long result = Fib.getFibonacciNumber(46);
        Assertions.assertEquals(1836311903L, result);
    }
}
