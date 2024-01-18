package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest2 {
    public static void main(String[] args) {
        String str1 = "asdgf";
        String str2 = "asfasf 00";
        String str3 = "ABCD12";
        String regexp = "^[a-z|A-Z]*$"; //a-z a에서 z까지 허용, A-Z 대문자 A 에서 Z까지 허용

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
    }
}
