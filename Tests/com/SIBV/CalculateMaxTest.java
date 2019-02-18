package com.SIBV;

import com.SIBV.Max;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateMaxTest {
    Max m = new Max();

    @Test
    void getMax() {
        int res = m.getMax(8, 9);
        Assertions.assertEquals(res,9);
    }

    @Test
    public void getMaxEquals() {
        Assertions.assertEquals(m.getMax(9, 9), 9);
    }
    @Test
    public void getMaxNegative(){
        Assertions.assertEquals(m.getMax(-5,-9),-5);
    }
}