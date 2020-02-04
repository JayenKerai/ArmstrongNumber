package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArmstrongNumberFinder {

    ArmstrongNumberFinder armstrongNumberFinder = new ArmstrongNumberFinder();

    @Test
    public void testThatValidNumber1ReturnsTrue() {
        Assertions.assertTrue(armstrongNumberFinder.isArmstrongNumber(1));
    }

    @Test
    public void testThatValidNumber153ReturnsTrue() {
        Assertions.assertTrue(armstrongNumberFinder.isArmstrongNumber(153));
    }

    @Test
    public void testThatValidNumber370ReturnsTrue() {
        Assertions.assertTrue(armstrongNumberFinder.isArmstrongNumber(370));
    }

    @Test
    public void testThatValidNumber371ReturnsTrue() {
        Assertions.assertTrue(armstrongNumberFinder.isArmstrongNumber(371));
    }

    @Test
    public void testThatValidNumber407ReturnsTrue() {
        Assertions.assertTrue(armstrongNumberFinder.isArmstrongNumber(407));
    }

    @Test
    public void testThatInvalidInputReturnsTrue() {
        Assertions.assertFalse(armstrongNumberFinder.isArmstrongNumber(123));
    }

    @Test
    public void testThatInvalidInput0ReturnsFalse() {
        Assertions.assertFalse(armstrongNumberFinder.isArmstrongNumber(0));
    }

    @Test
    public void testThatLongInvalidNumberReturnsFalse() {
        Assertions.assertFalse(armstrongNumberFinder.isArmstrongNumber((int) 123456789123456789L));
    }

    @Test
    public void testThatNegativeNumberReturnsFalse() {
        Assertions.assertFalse(armstrongNumberFinder.isArmstrongNumber(-21));
    }

    @Test
    public void testThatMaxValueReturnsFalse() {
        Assertions.assertFalse(armstrongNumberFinder.isArmstrongNumber(Integer.MAX_VALUE));
    }

    @Test
    public void testThatMaxValuePlus100ReturnsFalse() {
        Assertions.assertFalse(armstrongNumberFinder.isArmstrongNumber(Integer.MAX_VALUE + 100));
    }

}
