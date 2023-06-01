package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoilingWaterTest {
    @Test
    public void testIsWaterBoiling() {
        BoilingWater boilingWater = new BoilingWater();

        assertFalse(boilingWater.isWaterBoiling(200));
        assertTrue(boilingWater.isWaterBoiling(212));
        assertTrue(boilingWater.isWaterBoiling(250));
    }
}
