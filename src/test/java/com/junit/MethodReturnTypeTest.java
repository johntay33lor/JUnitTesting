package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodReturnTypeTest {
    @Test
    void string_ReturnsExpectedString() {

        String expectedString = "Here is the string";

        String actualString = MethodReturnType.string();

        assertEquals(expectedString, actualString);
    }

    @Test
    void num_ReturnsExpectedNumber() {

        int expectedNumber = 13;

        int actualNumber = MethodReturnType.num();

        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    void bool_ReturnsExpectedBoolean() {

        boolean expectedBoolean = true;

        boolean actualBoolean = MethodReturnType.bool();

        assertEquals(expectedBoolean, actualBoolean);
    }
}
