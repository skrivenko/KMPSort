package ru.crafts;

import java.math.BigDecimal;
import java.util.Arrays;

public class Calculator {
    public static String add(String numbers) {
        if (numbers.isBlank()) {
            return "0";
        }
        BigDecimal number = new BigDecimal(0);
        for(String text : numbers.split(",")) {
             number = number.add(new BigDecimal(
                     String.valueOf(text)));
        }
        return number.toString();
    }
}
