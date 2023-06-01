package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {
    @Test
    void divide_TwoNumbers_ReturnsQuotient() {

        double num1 = 10.0;
        double num2 = 2.0;

        DivideMethod Division;
        double actualQuotient = DivideMethod.divide(num1, num2);

        assertEquals(5, actualQuotient);
    }

    @Test
    void divide_DivideByZero_ReturnsInfinity() {

        double num1 = 5.0;
        double num2 = 0.0;
        double expectedQuotient = Double.POSITIVE_INFINITY;

        double actualQuotient = DivideMethod.divide(num1, num2);

        assertEquals(expectedQuotient, actualQuotient);
    }

}
