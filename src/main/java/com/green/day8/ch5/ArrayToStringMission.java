package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3 };
        System.out.printf("[%d", arr[0]);
        for(int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.print("]");
    }
}
