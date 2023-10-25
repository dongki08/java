package com.green.day16.ch7;

import static com.green.day13.ch6.MyMath2.staticAbs;
import static com.green.day13.ch6.MyMath2.staticNum;

import com.green.day15.ch7.Parent; //자바 패키지명에 대문자 x, 마지막 parent 대문자 시작 (클래스),
// Parent 대신 * 해당패키지에 있는 모든 클래스파일 임포트

public class PackageTest {
    public static void main(String[] args) {
        Parent parent;
        staticAbs(10);
        staticNum = 10;
    }
}
// 생성자 이용해서 private 한 멤버필드(클래스)에 값을 넣는다
// public이 붙은 메소드를 통해서 private한 멤버필드(클래스)에 갑을 넣는다
