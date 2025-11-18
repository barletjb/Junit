package com.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Sum of two plus two")
    void checkSum() {
        assertAll(
                "Check multiple Sums",
                () -> assertEquals(10, Calculator.sum(5,5)),
                () -> assertEquals(7, Calculator.sum(5,2)),
                () -> assertNotEquals(10, Calculator.sum(7,9))

        );
    }

    @Test
    void checkIfTwoMultiplyByFiveEqualsTen() {
        assertEquals(10, Calculator.multiply(2, 5));
    }
}