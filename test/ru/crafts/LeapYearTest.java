package ru.crafts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void yearIsNotLeapYear() {
        assertFalse(LeapYear.isLeapYear(2019));
    }

    @Test
    public void yearIsLeapYear() {
        assertTrue(LeapYear.isLeapYear(2020));
    }

    @Test
    public void yearWithHundredsIsNotLeapYear() {
        assertFalse(LeapYear.isLeapYear(1700));
    }

    @Test
    public void yearWithFourHundredsIsLeapYear() {
        assertTrue(LeapYear.isLeapYear(2000));
    }
}
