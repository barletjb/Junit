package com.example;

public class IsbnValidator {

    public boolean isValidIsbn10(String isbn) {
        if (isbn == null || isbn.length() != 10) return false;

        int total = 0;
        for (int i = 0; i < 10; i++) {
            char c = isbn.charAt(i);

            if (c == 'X' && i == 9) {
                total += 10;
            } else if (Character.isDigit(c)) {
                total += (c - '0') * (10 - i);
            } else {
                return false;
            }
        }

        return total % 11 == 0;
    }
}
