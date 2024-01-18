package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest5 {
    public static void main(String[] args) {
        String str1 = "010-1";
        String str2 = "011-12";
        String str3 = "012-123";
        String str4 = "013-1234";
        String str5 = "014-12345";
        String str6 = "015-0000-0000";
        String str7 = "016-0000-12345";
        String str8 = "017";
        String str9 = "018";
        String str10 = "019-1234-5678";
        String regexp = "^01[0-1|6-9]{1}-[\\d]{3,4}-[\\d]{4}$"; // \\d숫자

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));
        System.out.printf("%s > %b\n", str6, Pattern.matches(regexp, str6));
        System.out.printf("%s > %b\n", str7, Pattern.matches(regexp, str7));
        System.out.printf("%s > %b\n", str8, Pattern.matches(regexp, str8));
        System.out.printf("%s > %b\n", str9, Pattern.matches(regexp, str9));
        System.out.printf("%s > %b\n", str10, Pattern.matches(regexp, str10));
    }
}
