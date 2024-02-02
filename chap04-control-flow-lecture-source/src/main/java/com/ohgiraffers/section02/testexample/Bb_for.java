package com.ohgiraffers.section02.testexample;

import java.util.Scanner;

public class Bb_for {

    /* /* 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
     * -- 입력 예시 --
     * 정수를 입력하세요 : 10
     *
     * -- 출력 예시 --
     * 1부터 10까지 짝수의 합 : 30*/

    public void testExampleForStatement1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 ");
        int Num1 = sc.nextInt();

        int sum1 = 0;

        for( int i= 0; i <= Num1; i++){
            if(i % 2 == 0){
            sum1 +=i;

            }
        }
        System.out.println("1부터" + Num1 + "까지의 짝수의 합: " + sum1);
    }

    public void testExampleForStatment2(){

        /*정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 토마토마토*/

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int num1 = sc.nextInt();

        int sum1 =0;

        for( int i= 1; i<=num1; i++){
            if(i % 2 == 1){
                System.out.print("토");

            }else {
                System.out.print("마");

            }

        }
    }
    /*다른풀이.
    *   String str1 = "토";
        String str2 = "마";
        String result = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                result += str1;
            }else{
                result += str2;
            }
        }

        System.out.println(result);
        *
        * */
}
