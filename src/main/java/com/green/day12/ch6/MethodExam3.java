package com.green.day12.ch6;

import com.green.day11.ch6.MethodExam2;

public class MethodExam3 {
    int sumText(String Str) {
        int val = Integer.parseInt(Str);
        int sum = 0;
        do {
            int modVal = val % 10;
            sum += modVal;
            val /= 10;
        } while (val > 0);
        return sum;
    }

    int sumText2(String Str) {
        char[] charArr = Str.toCharArray();
        int sum = 0;
        for(char ch : charArr) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodExam3 me3 = new MethodExam3();

        String test = "9871231";
        System.out.println(me3.sumText(test));
        System.out.println(me3.sumText2(test));

        int sum = me3.sumText("123123");
        System.out.println("sum : " + sum);

        sum = me3.sumText2("123123");
        System.out.println("sum : " + me3.sumText2("222"));
    }
}
