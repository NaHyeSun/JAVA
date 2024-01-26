package com.ohgiraffers.practics01;

public class chap01 {
    public static void main(String[] args) {

        /*실습문제1
        * 정수형 변수 2개를 선언하여, 각 20과 30으로 초기화 한 후,두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요.*/


         int inum = 20;
         int inum1 = 30;

        System.out.println(inum + inum1);
        System.out.println(inum - inum1);
        System.out.println(inum * inum1);
        System.out.println(inum / inum1);
        System.out.println(inum % inum1);

        /*실습문제2
        * 사각형의 넓이와 둘레를 구하여 출력합니다.너비 12.5 높이 36.4를 변수에 저장하고,
        * 넓이와 둘레를 계산한 뒤 변수에 담아 아래와 같이 출력하세요.*/

        double height = 36.4;
        double width = 12.5;

        System.out.println(height * width);
        System.out.println((height + width )* 2);



        /*실습문제3
        * 문자형 변수를 하나 선언하고 'a'를 대입한 후, 문자 'a'가 가지는 유니코드값을 출력하세요.
        * */

        char unicode = 'a';
        int unicode2 = unicode;
        System.out.println("문자 a의 unicode값은? :" + unicode2);

        /*실습문제4
        국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤, 총점과 평균을 정수 형태로 출력하세요.
         */

        double A = 80.5;
        double B = 50.6;
        double C = 70.8;
        int total = (int)(A+B+C);

        System.out.println(total);
        System.out.println(total/3);

















    }
}
