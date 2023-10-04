package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main (String[] args) {
        // 1. 대소문자 구별. 길이제한 x
        int abc, aBc, abC, asdasfgasgasfasgasdagsag;

        // 2. 예약어 사용 x
        //int int, void, static;

        // 3. 숫자로 시작해선 안된다
        //int 1ab; x
        int a1b, ab1;

        // 4. 특수 문자 _, $만 가능
        int _ab, $ab;

        //-------------------------------------------------------------

        // 케이스 기법
        // hello my name is hong

        // 1. 파스칼 케이스 기법 (클래스명)
        // HelloMyNameIsHong (앞글자만 대문자) > 대문자로 시작

        // 2. 카멜 케이스 기법 (변수명, 메소드명) > 소문자로 시작
        // helloMyNameIsHong

        // 3. 케밥 케이스 기법 (css에서 사용)
        // hello-my-name-is-hong

        // 4. 스네이크 케이스 기법
        // hello_my_name_is_hong

        //--------------------------------------------------------------------
        // 상수는 전부 대문자 구분은 언더바

        // PI, MAX_NUMBER
        final int PI = 0, MAX_NUMBER = 10;

        Date today = new Date(); //대문자 참조형(레퍼런스 변수), 소문자 기본형(프라머티브 타입)
    }
}