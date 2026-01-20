package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add_works() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void divide_works() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void divide_decimal_works() {
        assertEquals(0, Calculator.divide(2, 3));
    }
}
