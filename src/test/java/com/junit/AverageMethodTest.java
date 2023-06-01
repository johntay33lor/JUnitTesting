package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageMethodTest {
    @Test
    void sum_ThreeIntegers_ReturnsSum() {

        var calculator = new AverageMethod();

        int sum = calculator.sum(2, 2, 2);

        assertEquals(6, sum);
    }

    @Test
    void average_ThreeIntegers_ReturnsAverage() {

        var averageResult = new AverageMethod();

        int average = (int) averageResult.average(2, 2, 2);

        assertEquals(2, average);
    }
}