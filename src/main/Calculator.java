package com.example;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
    // BUG: falscher Divisor -> Division durch 0
    // FIX: Divisor 0 durch b ersetzen
    return a / b;
}

}
