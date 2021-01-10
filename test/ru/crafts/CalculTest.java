package ru.crafts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculTest {
    @Test
    public void returnZeroForEmptyString () {
        String result = Calculator.add("");
        String expected = "0";
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void returnOneForOne () {
        String result = Calculator.add("1");
        String expected = "1";
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void returnFourForOneAndThree () {
        String result = Calculator.add("1,3");
        String expected = "4";
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void returnThreePointThreeForTwoNumbers () {
        String result = Calculator.add("1.2,3.4");
        String expected = "4.6";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void processDoublePrecisionError () {
        String result = Calculator.add("13.22,4.88,21.45");
        String expected = "39.55";
        Assertions.assertEquals(expected, result);
    }

}
