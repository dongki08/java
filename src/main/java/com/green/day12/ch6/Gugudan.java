package com.green.day12.ch6;

public class Gugudan {
    void print (int DAN) {
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", DAN, i, DAN * i  );
        }
    }

    void printFromTo (int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            print(i);
        }
    }

}
