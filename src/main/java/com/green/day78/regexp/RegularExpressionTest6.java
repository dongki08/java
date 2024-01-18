package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest6 {
    public static void main(String[] args) {
        String str1 = "040324-3674593";
        String str2 = "040391-1674593";
        String str3 = "040324-33674593";
        String str4 = "0403324-36374593";
        String str5 = "014-12345";
        String str6 = "015-0000-0000";
        String str7 = "016-0000-12345";
        String str8 = "017";
        String str9 = "018";
        String str10 = "019-1234-5678";
        String regexp = "^[\\d]{2}((02(0[1-9]|1[0-9]|2[0-9]))|(0[1|3-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1]))-[1-4][0-9]{6}$"; // \\d숫자

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
