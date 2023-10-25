package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30;
        System.out.println("(1)num : " + num);
        changeVal(num);
        System.out.println("(2)num : " + num);

        NumBox nb = new NumBox();
        System.out.println("nb.num(1) : " + nb.num);
        nb.num = 30;
        System.out.println("nb.num(2) : " + nb.num);
        changeVal(nb);
        System.out.println("nb.num(3) : " + nb.num);
    }

    public static void changeVal(int num) {
        System.out.println("changeVal - int");
        num = 10;
    }

    public static void changeVal (NumBox nb2) {
        System.out.println("changeVal - NumBox");
        nb2 = new NumBox();
        nb2.num = 10;
    }
}

class NumBox {
    int num;
}
