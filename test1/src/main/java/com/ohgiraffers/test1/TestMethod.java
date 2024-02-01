package com.ohgiraffers.test1;

import java.util.Random;
import java.util.Scanner;

public class TestMethod {
    /*1. Calculator 메소드를 하나 생성하여 매개변수를 정수형으로 2개 선언 후 매개변수끼리의 연산을
         복합 대입 연산자로 종류별로 출력되도록 작성. (단, 리턴값은 없는 메소드로 작성.)
         --- 출력 예시 ----
        두 수를 더한 값은 ~~ 입니다.*/

    public void Calculator(int num1, int num2) {

        System.out.println("두 수를 더한 값은 " + (num1 += num2) + "입니다.");
        System.out.println("두 수를 뺀 값은 " + (num1 -= num2) + "입니다. ");
        System.out.println("두 수를 곱한 값은 " + (num1 *= num2) + "입니다");
        System.out.println("두 수를 나눈 값은 " + (num1 /= num2) + "입니다");
        System.out.println("두 수를 나눈 값의 나머지는" + (num1 %= num2) + "입니다");


    }
    /*2. CircleArea 메소드를 하나 생성. (리턴값이 있으며 리턴값은 double형)
          원주율을 상수로 선언하고 초기화(3.14)
         반지름을 입력받아서 원의 부피를 구하는 결과값을 변수로 저장하고 그 결과값을 리턴해준다.
         (부피를 구하는 공식 :  원주율 * 반지름 * 반지름 )*/

    public double CircleArea() {

        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.print("반지름을 입력하세요");
        int a = sc.nextInt();

        double bu = pi * a * a;
        return bu;

        }
        /* TestRandom 메소드를 생성 ( static 으로 생성해준다 ) (리턴값 있음)
           1~10까지의 난수를 생성해주고 변수에 저장해준다.
           생성된 난수값이 뭔지 알려주는 출력문을 알맞는 자료형으로 result 변수에 저장해준다.
           리턴값을 result로 해준다.*/

        public static String TestRandom(){

            int randomNum1 =(int)(Math.random() * 10)+1;

            String result2 = "생성된 난수는" + randomNum1 + "입니다. ";
            return result2;


        }

}
