package com.ohgiraffers.practics01;

public class chap02 {
    public static void main(String[] args) {

        /*실습문제 1
        *  두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여 , 두 수 중 큰 수를 출력하는 프로그램을 작성해본다.*/

        int num1 = 30;
        int num2 = 20;


        int result1 = (num1 > num2)? num1 : num2;
//        String result1 = (num1 > num2)? "참" : (num1 < num2)? "20" : "10" ;
        System.out.println("두 수 중 큰 수는? :" + result1);


        /*실습문제 2
        * 정수형 변수를 선언하여 점수를 저장하고, 삼항 연산자를 사용하여 점수가 60점 이상이면 “합격입니다”,
           그렇지 않으면 “아쉽지만 불합격입니다.” 을 출력하는 프로그램을 작성해본다.*/

        int score1 = 50;
        int score2 = 70;

        String score = (score2 >= 60)? "합격입니다." : "불합격입니다.";
        System.out.println(score);


        /*실습문제 3
        * 정수형 변수를 선언하고, 삼항연산자를 사용하여 입력된 수가 짝수인지 홀수인지 출력하는 프로그램을 작성해본다.
          참고사항 : 조건식에 %를 활용하여 짝수인지 홀수인지를 */

        int num4 = 4;

        String str1= "짝수";
        String str2= "홀수" ;
        String str = ((num4 % 2)== 0)? "짝수" : "홀수";
        System.out.println(str);




        /*실습문제 4
        *  실수를 변수로 선언하여 점수를 저장하고, 이를 정수로 변환하여 점수가 90점 이상이면 ”A”,80점 이상이면 “B”,
           70점 이상이면 “C”, 60점 이상이면”D”, 60점 이하이면 “F”를 출력하는 프로그램을 작성해본다.*/

        double dscore = 78.5;
        int iscore = (int) dscore;
        String result3 = (dscore >= 90)? "A" : (dscore >= 80)? "B" :(dscore >= 70)? "C" : (dscore >= 60)? "D" : "F";
        System.out.println("78.5점은: " + result3);



        /*실습문제 5
        * 정수형 변수를 두개 선언하여 회원의 월(month)과 일(day)를 저장합니다.
          월이 1월부터 6월까지이면서, 일이 1일부터 15일까지인 경우 “배민 쿠폰”을,
          월이 7월부터 12월까지이면서, 일이 16일부터 31일까지인 경우 “스타벅스 커피”를
          그 외의 경우는 “사탕”이 선물로 선택되는 프로그램을 작성해본다.*/

        int month = 10;
        int day = 7;

        String bir = (month <= 6 && day <= 15)? "배민 쿠폰" : (month >= 7 && day >= 16)? "스타벅스 커피" : "사탕";
        System.out.println("혜선 생일 선물은: " + bir);
















    }
}
