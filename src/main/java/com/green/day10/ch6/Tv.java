package com.green.day10.ch6;

public class Tv {
        String color;
        boolean power;
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
