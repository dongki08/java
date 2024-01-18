package com.green.day68.ch14;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyArrayList {
    private int[] arr;


    public MyArrayList(){
        arr = new int[0];
    }

    public void add(int val){
        int[] newArr = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = val;

        arr = newArr;
    }

    public int[] getArr(){
        return arr;
    }

    public void forEach(Consumer<Integer> con) {
        for(int i = 0; i < arr.length; i++) {
            con.accept(arr[i]);
        }
    }

    public void removeIf2(Predicate<Integer> pre) {
        MyArrayList tempList = new MyArrayList();
        for(int i = 0; i < arr.length; i++) {
            if( !pre.test(arr[i]) ) {
                tempList.add(arr[i]);
            }
        }
        this.arr = tempList.getArr();
    }

    public void removeIf(Predicate<Integer> o) {
        int[] temp = new int[0];
        for(int i = 0; i < arr.length; i++) {
            if( !o.test(arr[i]) ) {
                int[] temp2 = new int[temp.length + 1];

                for(int z = 0; z < temp.length; z++) {
                    temp2[z] = temp[z];
                }

                temp2[temp.length] = arr[i];
                temp = temp2;
            }
        }
        arr = temp;
    }
}
