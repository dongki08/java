package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        // 클래스 : 문서, 설계도, 설명
        // 객체(Object, instance) : 아파트, Tv, 제품
        // 객체의 구성요소 : 속성(명사, 멤버필드, property), 메소드(동사, 멤버메소드)
        String Str = new String("dd");
        //Tv tv3 = Str;

        Tv tv1 = new Tv();
        tv1.channel = 10;
        tv1.power = false;
        tv1.color = "빨간색";

        Tv tv2 = new Tv();
        tv2.channel = 20;

        System.out.println("tv1 == tv2 >> " + (tv1 == tv2));

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.power : " + tv1.power);
        System.out.println("tv1.color : " + tv1.color);

        System.out.println("-------------------");
        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv2.power : " + tv2.power);
        System.out.println("tv2.color : " + tv2.color);

    }
}
