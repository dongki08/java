package com.green.day68.ch14;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(Arrays.toString(list.getArr()));
        list.add(10);
        System.out.println(Arrays.toString(list.getArr()));
        list.add(20);
        System.out.println(Arrays.toString(list.getArr()));
        list.add(30);
        System.out.println(Arrays.toString(list.getArr()));
        list.forEach(i -> System.out.println("i :" + i));
        list.removeIf(v -> v % 2 == 0);
        list.forEach(i -> System.out.print(i + ","));
    }
}
