package com.green.day10.ch6;

public class Tv {
        //멤버필드, 속성, property, 전역변수
        String color;
        boolean power; //소문자 시작 프라머티브타입 주소값 가질 수 없음 값만
        int channel;

        //멤버메소드, 메소드
        //리턴타입void 메소드명power 파라미터:메개변수()
        // void power() : 메소드 선언부
        // { power = !power; } : 구현부
        // 호출시 선언부만
        void power() { power = !power; }
        void channelUp() { channel++; }
        void channelDown() { channel--; }
}
