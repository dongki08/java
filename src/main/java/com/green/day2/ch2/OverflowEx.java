package com.green.day2.ch2;

public class OverflowEx {
    public static void main(String[] args) {
        int intval = 5;
        byte byteval = (byte)intval;
        System.out.printf("byteval : %d\n", byteval);

        int intval2 = 129;
        byte byteval2 = (byte)intval2; //오버플로우 Overflow
        System.out.printf("byteval2 : %d\n", byteval2);

        int intval3 = -129;
        byte byteval3 = (byte)intval3; //언더플로우 Underflow
        System.out.printf("byteval3 : %d\n", byteval3);

    }
}
