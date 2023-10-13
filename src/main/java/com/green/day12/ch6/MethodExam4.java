package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {

    int[] plusMap (int[] arr, int val) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            temp[i] = arr[i] + val;
        return temp;
    }
    void plusOrigin (int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
    }

    int[] randomValFromTo (int n1, int n2, int n3) {
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
                arr1[i] = (int)(Math.random() * ( n3- n2 ) + 1) + n2;
        }return arr1;
    }

    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = { 10, 20, 30 };
        int[] rArr1 = me4.plusMap(arr, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr1));

        me4.plusOrigin(arr, 4);
        System.out.println(Arrays.toString(arr));

        int[] rArr2 = me4.randomValFromTo(10, 5, 20);
        System.out.println(Arrays.toString(rArr2));
    }
}
