package com.green.day11.ch6;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class MethodExam2 {
    String scoreResultOpt(int score) {
        if (score < 0 || score > 100) {
            return "점수를 확인해 주세요";
        }
        String grade = "C";
        if (score == 100) {
            return "A+";
        } else if (score < 70) {
            return "D";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        String opt = "0";
        int rMod = score % 10;
        if (rMod >= 8) {
            opt = "+";
        } else if (rMod <= 3) {
            opt = "-";
        }
        return grade + opt + "학점";

    }

    String getSeason(int mon) {
        switch (mon) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 12, 1, 2:
                return "겨울";
            default:
                return "없는 계절입니다.";
        }
    }


}
