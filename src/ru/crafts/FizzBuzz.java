package ru.crafts;

public class FizzBuzz {

    public static String play(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }

        return !result.isEmpty() ? result : String.valueOf(number);
    }
}