package com.ohgiraffers.section02.testexample;

import java.util.Scanner;

public class Aa_if {
    public void testExample5Statement() {

        /*실습문제 1. */
        /* 판다가 축제 아르바이트를 시작했습니다.
         * 맥주를 판매하려면 성인인지 확인을 해야 해요.
         *
         * '나이가 어떻게 되세요?'를 출력하고 나이(정수)를 입력받아, 성인이면 '판매 가능합니다.'를 출력하고,
         * 미성년자이면 '판매 불가능합니다. 음료 코너에서 골라주세요.' 를 출력하세요.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("나이가 어떻게 되세요? ");
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("판매 가능합니다. ");
        } else {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요. ");
        }


        /*실습문제2. */
        /* 판다가 숫자 뽑기를 통해 선물을 나눠주는 이벤트 부스에서 일합니다.*
         * "당첨 번호가 어떻게 되세요?"를 출력하여, 1~10 사이의 정수 한개를 입력받고,
         * 홀수인지 짝수인지 확인하고, 홀수이면 "홀수네요, 인형 선물입니다!", 홀수가 아니면 "짝수네요, 모자 선물입니다!"라고 출력하세요.
           단, 1~10 사이의 정수가 아닌 경우 "당첨 번호는 1~10 사이에만 있어요."를 출력하세요.*/


        System.out.println("당첨 번호가 어떻게 되세요? ");
        int luckyNum = sc.nextInt();

        if (luckyNum >= 1 && luckyNum <= 10) {
            if (luckyNum % 2 != 0) {
                System.out.println("홀수네요, 인형 선물입니다.!");
                if (luckyNum % 2 == 0) {
                    System.out.println("짝수네요, 모자 선물입니다. ");
                }
            }

        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.  ");

        }

    }

    public void testExample6Statement() {
        /* 판다는 축제 부스에서 일한 뒤, 인사평가 점수를 받았습니다.
         * 성실, 서비스, 미소 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
           단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해 주어야 합니다.
           * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다."라고 출력하고,
         * 항목당 과락 점수가 있는 경우 "xx 항목의 점수 미달로 불합격 입니다."를 출력하세요.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("성실 점수를 입력 해 주세요. ");
        int score1 = sc.nextInt();
        System.out.println("서비스 점수를 입력 해 주세요.");
        int score2 = sc.nextInt();
        System.out.println("미소 점수를 입력 해 주세요. ");
        int score3 = sc.nextInt();

        int total = score1 + score2 + score3;

        if (score1 < 40) {
            System.out.println("성실 점수 미달로 불합격 입니다.");
            return;
        } else if (score2 < 40) {
            System.out.println("서비스 점수 미달로 불합격 입니다.");
            return;

        } else if (score3 < 40) {
            System.out.println("미소 점수 미달로 불합격 입니다.");
            return;
        } else if (total / 3 < 60) {
            System.out.println("평균 점수 미달로 불합격 입니다. ");
            return;

        }
        System.out.println("합격입니다.");

    }

}