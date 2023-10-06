package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7_2 {
    public static void main(String[] args) {
        //1. 정수 10개를 저장할 수 있는 배열을 만든다.
        //   0~9값을 순차적으로  대입한다.
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        for (int i = 0; i < arr1.length; i++) {
            int rIdx = (int) (Math.random() * arr1.length);
            int tmp = arr1[i];
            arr1[i] = arr1[rIdx];
            arr1[rIdx] = tmp;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
