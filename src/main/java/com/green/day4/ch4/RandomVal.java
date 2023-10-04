package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleVal = Math.random(); //0.000 ~ 0.999
        System.out.println("doubleval : " + doubleVal);

        int intval = (int)(doubleVal * 10);
        System.out.println("intval : " + intval);

        int rVal = (int)(Math.random() * 20);
        System.out.println("rVal : " + rVal);
    }
}
