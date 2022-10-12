package com.name.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    @Test
    public void testFactorialGivenWrongArgument() {
        Assert.assertThrows(Exception.class, () -> MathUtil.getFactorial(-1));
    }
}
