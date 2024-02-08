package com.ohgiraffers.example.student.model.vo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentVO studentVO = new StudentVO();

        Scanner sc = new Scanner(System.in);

        System.out.print("학년을 입력하세요");
        studentVO.setGrade(sc.nextInt());

        System.out.print("반을 입력하세요");
        studentVO.setClassroom(sc.nextInt());

        System.out.print("이름을 입력하세요");
        studentVO.setName(sc.next());

        System.out.print("키를 입력하세요");
        studentVO.setHeight(sc.nextDouble());

        System.out.print("성별을 입력하세요");
        studentVO.setGender(sc.next().charAt(0));

        System.out.println();

        studentVO.printInformation();



    }
}
