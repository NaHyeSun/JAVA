package com.ohgiraffers.test2;

import com.ohgiraffers.test1.TestMethod;
import static com.ohgiraffers.test1.TestMethod.TestRandom;

public class Application {
    public static void main(String[] args) {

        /*Calculator 메소드를 호출한다.*/
    TestMethod t= new TestMethod();
    t.Calculator(2,5);


    /*CircleArea 메소드를 호출하여 출력해본다.
      --- 출력 예시 ----
      원의 부피는 ~~~ 입니다.*/
    double d = t.CircleArea();
    System.out.println("원의 부피는" + d + "입니다. ");
       // System.out.println("원의 부피는" + t.CircleArea() + "입니다.");  이렇게도 가능


     /*3. TestRandom 메소드를 변수에 저장하고 리턴값이 출력되도록 출력문 작성.
           단, 다른 패키지에서의 메소드 호출이기 때문에 풀클래스 네임을 적어주거나
           또는 임포트를 해야하는데 임포트 하는 방식을 사용한다.*/

     String str= TestRandom();
        System.out.println(str);


    }

}
