package ru.crafts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    @Test
    public void greetBob() {
        assertEquals("Hello, Bob.", Greeting.greet("Bob"));
    }

    @Test
    public void greetFriend() {
        assertEquals("Hello, my friend.", Greeting.greet(null));
    }

    @Test // Test 3
    public void greetLoudJERRY() {
        assertEquals("HELLO JERRY!", Greeting.greet("JERRY"));
    }

    @Test // Test 4
    public void greetJillJane() {
        assertEquals("Hello, Jill and Jane.",
                Greeting.greet("Jill", "Jane"));
    }

    @Test // Test 5
    public void greetAmyBrianCharlotte() {
        assertEquals("Hello, Amy, Brian, and Charlotte.",
                Greeting.greet("Amy", "Brian", "Charlotte"));
    }

    @Test // Test 6
    public void greetAmyBRIANCharlotte() {
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!",
                Greeting.greet("Amy", "BRIAN", "Charlotte"));
    }
}
