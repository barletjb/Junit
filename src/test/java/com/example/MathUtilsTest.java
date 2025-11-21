package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    @DisplayName("Substract of one minor two")
    void testSubtract() {
        //Givent
        int a = 1;
        int b = 2;
        int expected = -1;

        //When
        int actual = MathUtils.subtract(a, b);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void testIsPositive() {
        int a = 1;
        boolean expected = true;

        boolean actual = MathUtils.isPositive(a);

        assertEquals(expected, actual);
    }

    @Test
    void testSquare() {
        int n = 10;
        int expected = 100;
        int actual = MathUtils.square(n);
        assertEquals(expected, actual);
    }
}