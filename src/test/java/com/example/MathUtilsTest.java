package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    @DisplayName("Substract of one minor two")
    void testSubtract() {
        int a = 1;
        int b = 2;
        int expected = MathUtils.subtract(a, b);
        assertEquals(expected, MathUtils.subtract(a, b));
    }

    @Test
    void testIsPositive() {
        int a = 1;
        boolean expected = true;
        assertEquals(expected, MathUtils.isPositive(a));
    }

    @Test
    void testSquare() {
        int n = 10;
        int expected = MathUtils.square(n);
        assertEquals(expected, MathUtils.square(n));
    }
}