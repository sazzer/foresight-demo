package com.baeldung.foresightdemo;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void testFailing() {
        var rand = new SecureRandom();
        var value = rand.nextDouble();

        if (value > 0.5) {
            fail();
        }
    }

    @Test
    void testSlow() throws InterruptedException {
        var rand = new SecureRandom();
        var value = rand.nextInt(10000);

        Thread.sleep(value);
    }
}