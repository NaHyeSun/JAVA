package com.ohgiraffers.Example;

import java.util.Scanner;


public class Application_ex1 {
    public static void main(String[] args) {

        /*실습문제 1.*/
        /* 1. 길이가 5인 String 배열 선언
         * 2. "딸기", "바나나", "복숭아", "키위", "사과"로 초기화
         * 3. 스캐너로 0부터 4까지의 정수를 입력받아
         * 4. 해당 정수의 인덱스에 있는 과일을 출력
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.*/

        String[] fruit = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);


////        for(int i= 0; i < fruit.length; i++){
//            System.out.println( "정수를 입력해 주세요.");
//            int num = sc.nextInt();
//            if(num <= 4){
//                System.out.println(fruit[num]);
//            }else{
//                System.out.println("준비된 과일이 없습니다. ");
//            }
////            break;
//
//
//        System.out.println();


        /* 실습문제 2.
         * 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요.
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1*****
         * hint : toCharArray() 메소드 활용
           예시 )  char arr[] = number.toCharArray();    ←  문자열을 문자형 배열로 바꿔줌 */


//        System.out.println("주민등록번호를 입력 해 주세요. ");
//
//        String id = sc.nextLine();
//
//        char arr[] = id.toCharArray();
//
//        for (int i = 8; i < arr.length; i++) {
//            arr[i] = '*';
//
//        }
//        System.out.println(arr);




        /*실습문제 3.
        * * [ 로또번호 생성기 ]
         * 6칸짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
           Hint. 중복되는 난수 발생 시 break문을 사용해보자~!! (중첩 for문 사용) */

        int[] iarr = new int[5];
        int randomNum1 = (int)(Math.random() * 45+1);

        int iarr2 =randomNum1+iarr.length;
        for (int i = 0; i <= iarr.length; i++) {

            for (int j = i + 1; j < iarr.length; j++) {





                }



//                if(iarr2[i]>iarr2[j]){
//                    int temp = iarr2[i];
//                    iarr[i] = iarr[j];
//                    iarr[j] = temp;




            }
        }

    }
}