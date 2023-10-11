package com.green.day8.ch5;
import java.util.Arrays;
public class ArrayRandonMission {
    public static void main(String[] args) {
        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 10) + 1;
            System.out.println(arr1[i]);
            for(int z = 0; z < i; z++) {
                if(arr1[i] == arr1[z]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        }
    }
