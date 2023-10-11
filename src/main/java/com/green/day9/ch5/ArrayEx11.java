package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN]; // [5, 7, 1 ]
        int[] cntArr = new int[LEN]; //[0, 2, ]

        for(int i = 0; i < numArr.length; i++) {
            int rIdx = (int) (Math.random() * LEN);
            numArr[i] = rIdx;
        }
        System.out.println(Arrays.toString(numArr));

        //cntArr[1] = cntArr[1] + 1;
        //cntArr[1] += 1;
        //cntArr[1]++;

        /*
        for (int z = 0; z < cntArr.length; z++) {
            int val = numArr[z];
            cntArr[val]++;
        }
         */
        for (int val : numArr ) {
            cntArr[val]++;
        }

        for (int z = 0; z < cntArr.length; z++) {
            System.out.printf("%d의 개수 : %d\n",z , cntArr[z]);
        }
        /*
        numArr 각 방에 0~9사이의 랜덤값을 대입한다(중복허용)
        numArr 각 방의 값도 출력
        cntArr의 0번방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다.
        0~9의 개수를 출력
        [4, 4, 4, 6, 5, 7, 9, 7, 5, 3]
        0의개수 : 0
        1의개수 ; 0
        .
        .
        3의개수 : 3
         */
    }
}
