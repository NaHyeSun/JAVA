package com.ohgiraffers.prectice.question;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Student [] student = new Student [3];
        student[0] = new Student("홍길동",20, 178.2,70.0,1,"정보시스템공학과");
        student[1] = new Student("김말똥",21, 187.3,80.0,2,"경영학과");
        student[2] = new Student("강개순",23, 167.0,45.0,4,"정보통신공학과");

        int Student = 0;
        for(int i = 0; i < student.length; i++) {
            System.out.println(student[i].getInformation());
        }

        Employee [] employee = new Employee [10];
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(true) {

            System.out.println("이름을 입력하세요");
            String name = sc.next();
            System.out.println("나이를 입력하세요");
            int age = sc.nextInt();
            System.out.println("신장을 입력하세요");
            double height = sc.nextDouble();
            System.out.println("몸무게를 입력하세요");
            double weight = sc.nextDouble();
            System.out.println("급여를 입력하세요");
            int salary = sc.nextInt();
            System.out.println("부서를 입력하세요");
            sc.nextLine();
            String dept = sc.nextLine();

            employee[count] = new Employee(name, age, height, weight, salary, dept);
            count++;

            System.out.println("계속 추가하시겠습니까? (Y/N)");
            char answer = sc.nextLine().toUpperCase().charAt(0);

            if(answer == 'N'){
                break;
            }


        }
            for (int i = 0; i < count; i++) {
                System.out.println(employee[i].getInformation());
            }

        System.out.println();
    }
}







