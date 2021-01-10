package ru.crafts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void say1For1() {
        assertEquals("1", FizzBuzz.play(1));
    }

    @Test
    public void say2For2() {
        assertEquals("2", FizzBuzz.play(2));
    }

    @Test
    public void sayFizzFor3() {
        assertEquals("Fizz", FizzBuzz.play(3));
    }

    @Test
    public void sayBuzzFor5() {
        assertEquals("Buzz", FizzBuzz.play(5));
    }

    @Test
    public void sayFizzBuzzFor15() {
        assertEquals("FizzBuzz", FizzBuzz.play(15));
    }
}


