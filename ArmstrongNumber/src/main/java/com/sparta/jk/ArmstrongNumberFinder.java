package com.sparta.jk;

public class ArmstrongNumberFinder {
    public boolean isArmstrongNumber(Integer input) {
        String str = input.toString();
        int cubedNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            cubedNumber += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 3);
        }
        System.out.println(cubedNumber);
        return (cubedNumber == input);
    }
}
