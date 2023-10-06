package com.green.day8.ch5;

public class ArrayToStringMission3 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3 };

        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);

        }
        System.out.print("]");
    }
}
