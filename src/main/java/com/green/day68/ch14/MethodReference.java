package com.green.day68.ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
    public static void main(String[] args) {
        Function<String, Integer> f = v -> Integer.parseInt(v); //펑션 앞엔 파라미더타입 뒤엔 리턴타입
        // (v + "12") 가공이 들어가면 밑에와 동일하게 못한다
        Function<String, Integer> f2 = Integer::parseInt; //위 아래 둘다 같음

        System.out.println(f.apply("12") + 1);
        System.out.println(f2.apply("12") + 1);

        BiFunction<String, String, Boolean> bf = (s1, s2) -> s1.equals(s2); //아래와 동일
        BiFunction<String, String, Boolean> bf2 = String::equals;

        String s1 = new String("안녕");
        String s2 = new String("안녕");
        System.out.


                println("s1 == s2 : " + (s1 == s2));
        System.out.println(bf.apply(s1, s2));
        System.out.println(bf2.apply(s1, s2));

    }
}
