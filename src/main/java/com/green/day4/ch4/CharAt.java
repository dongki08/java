package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk".toUpperCase();
        System.out.println(str);

        System.out.println("result1 : " + str.charAt(0));
        char result = str.charAt(1);
        System.out.println("result1 : " + result);
        System.out.println("result1 : " + str.charAt(2));

    }
}
