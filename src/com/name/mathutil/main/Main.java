package com.name.mathutil.main;

import com.name.mathutil.core.MathUtil;

public class Main {

    public static void main(String[] args) {
        testTDDFirst();
    }

    public static void testTDDFirst() {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! Status | Expected: " + expected + " | Actual: " + actual);
        System.out.println("2! Status | Expected: 2" + " | Actual: " + MathUtil.getFactorial(2));
    }

}
