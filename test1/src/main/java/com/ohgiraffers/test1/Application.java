package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {
        /*
          1. 기본자료형 8개를 선언과 동시에 초기화 한다.
          2. 서로다른 자료형 값을 +연산하여 <강제형변환>을 이용하여 알맞는 변수에 담아준다. (1개만)
          3. 결과값을 삼항연산자를 활용하여 양수면 "양수입니다" 음수면 "음수입니다" 나올 수 있도록 코드작성.*/

        byte b= 1;
        short s =2;
        int i =3;
        long l =4L;
        float t = 5.5f;
        double d = 6.3;
        char c= 'a';
        boolean isTrue = true;

        int sum1 = (int)(l+i);

        String result= (sum1 >=0 )? "양수입니다. " :"음수입니다.";
        System.out.println("sum1의 값은: " + result);




    }

}
