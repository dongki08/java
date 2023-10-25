package com.green.day18.ch7;

import java.util.List;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }
    public void add(int val) {
        int[] tmp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = val;
        arr = tmp;
    }

    public String toString() {
        if(arr.length == 0) { return "[]";}
        String r = String.format("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            r += String.format(", %d", arr[i]);
        }
        r += "]";
        return r;
    }
                     // 1     // 40
    public void add(int a, int b) {
        int[] tmp = new int[arr.length + 1];
        tmp[a] = b;
        for(int i = 0; i < a; i++) {
            tmp[i] = arr[i];
        }
        for(int z = a ; z < arr.length; z++){
            tmp[z+1] = arr[z];
        }
        arr = tmp;
    }
}


class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.toString());

        list.add(1, 40);
        System.out.println(list.toString());

    }
}