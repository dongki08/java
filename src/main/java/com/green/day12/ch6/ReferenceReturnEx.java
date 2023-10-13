package com.green.day12.ch6;

class Data2 {
    int x;
    double d;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        d.d = 100.5;

        Data2 d2 = copyObj(d);
        System.out.println("d == d2 : " + (d == d2));
        System.out.println("d.x == d2.x : " + (d.x == d2.x));
        System.out.printf("d.d == d2.x : " + (d.d == d2.d));
    }

    public static Data2 copyObj(Data2 d) {
        Data2 copy = new Data2();
        copy.x = d.x;
        copy.d = d.d;
        return copy;
    }
}
