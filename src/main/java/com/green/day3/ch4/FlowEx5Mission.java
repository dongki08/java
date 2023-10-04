package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("성별을 적어주세요(남자, 여자) > ");
        String gender = scan.nextLine();
        System.out.print("키를 입력해 주세요 > ");
        int height = scan.nextInt();

        if("남자".equals(gender)) {
            if(height > 170) {
                System.out.printf("%dcm는 남자 평균 초과입니다.", height);
            }else if(height < 170) {
                System.out.printf("%dcm는 남자 평균 미만입니다.", height);
            }else {
                System.out.printf("%dcm는 남자 평균입니다.", height);
            }
        }else {
            if(height > 157) {
                System.out.printf("%dcm는 여자 평균 초과입니다.", height);
            }else if(height < 157) {
                System.out.printf("%dcm는 여자 평균 미만입니다.", height);
            }else {
                System.out.printf("%dcm는 여자 평균입니다.", height);
            }
        }


        //남자의 평균키 170, 여자의 평균키 157
        //Scanner이용하여 성별을 입력 받습니다 (남자, 여자)
        //키를 입력 받습니다.
        //평균키 미만면 "156cm는 남자 평균 미만입니다."
        //평균키랑 같다면 "170cm는 남자 평균입니다."
        //평균키랑 초과면 "170cm는 남자 평균 초과입니다."


        // 평균키 미만면 "146cm는 여자 평균 미만입니다."
        //평균키랑 같다면 "157cm는 여자 평균입니다."
        //평균키랑 초과면 "170cm는 여자 평균 초과입니다."

    }
}
