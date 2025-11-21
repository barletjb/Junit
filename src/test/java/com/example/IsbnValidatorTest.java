package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsbnValidatorTest {

    IsbnValidator validator = new IsbnValidator();

    @Test
    void testValidIsbn10() {

        boolean actual = validator.isValidIsbn10("0471958697");
        Assertions.assertTrue(actual);
    }

    @Test
    void testInvalidIsbn10() {

        boolean actual = validator.isValidIsbn10("0471958690");
        Assertions.assertFalse(actual);
    }

    @Test
    void testIsbnWithX() {

        boolean actual = validator.isValidIsbn10("0306406152");
        Assertions.assertTrue(actual);
    }
}