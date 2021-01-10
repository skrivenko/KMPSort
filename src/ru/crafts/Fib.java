package ru.crafts;

public class Fib {
    public static long getFibonacciNumber(int position) {
        if (position == 0) {
            return 0;
        }
        long a = 0, p = 0;
        long b = 1, q = 1;
        while (position > 0) {
            if (position % 2 == 0) {
                long prevP = p;
                p = p * p + q * q;
                q = 2 * prevP * q + q * q;
                position = position / 2;
            } else {
                long tempA = a;
                a = a * p + b * q;
                b = tempA * q + b * q + b * p;
                position = position - 1;
            }
        }
        return a;
    }
}
