package com.green.day8.ch5;

public class ArrayToStringMission2 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3 };

        int commaLen = arr.length - 1;
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(i < commaLen ? arr[i] + ", " : arr[i]);
        }
        System.out.print("]");
    }
}
