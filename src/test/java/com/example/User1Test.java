package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class User1Test {

    @Test
    @DisplayName("Check Person")
    void checkPerson() {
        User user1 = new User(32, "Jb", "test address", "test city");

        assertAll(
                "Info User",
                () -> assertEquals(32, user1.getAge(), "Age should be 32"),
                () -> assertEquals("Jb", user1.getName(), "Name should be Jb"),
                () -> assertEquals("test address", user1.getAddress(), "Address should be 'test address'"),
                () -> assertEquals("test city", user1.getCity(), "City should be 'test city'")

        );


    }
}