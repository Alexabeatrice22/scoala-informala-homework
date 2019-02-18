package com.SIBV;

import com.SIBV.FahrenheitToCelsius;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FahrenheitToCelsiusTest {
    FahrenheitToCelsius v = new FahrenheitToCelsius();

    @Test
    void change() {
        double temp = v.temperature(97.7);
        Assertions.assertEquals(temp,36.5);
        temp = v.temperature(-40);
        Assertions.assertEquals(temp,-40);
    }
}