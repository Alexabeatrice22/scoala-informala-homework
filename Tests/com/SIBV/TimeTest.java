package com.SIBV;

import com.SIBV.ValidOrNot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void valid() {
        int a = 0;
        int b = 0;
        Assertions.assertFalse(!ValidOrNot.correct(a,b));
    }
    @Test
    void validSad(){
        //Hours bad
        Assertions.assertFalse(ValidOrNot.correct(24,0));
        //Minutes bad
        Assertions.assertFalse(ValidOrNot.correct(23,60));
        //Both bad
        Assertions.assertFalse(ValidOrNot.correct(24,60));
    }
}