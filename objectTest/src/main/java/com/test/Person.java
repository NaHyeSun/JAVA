package com.test;

import java.util.Scanner;

public class Person {
    /* 사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스) ---- 캡슐화
    *  */

    private String name;
    private int age;
    private String nationality;
    private Dog myDog;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {

        /* String[]  국적 배열 만든 후 반복문,조건문 작성 */

        String[]national = new String[]{"Korea","Japan","China", "HongKong", "Turkey"};

        for(String nationalList : national) {               //향상된 for문 사용
            if(nationality.equals(nationalList)) {          //nationality = set에 넣을 값 . equals (nationalList )
                this.nationality = nationality;
                break;

            } else {
                this.nationality = "Korea";

            }
        }
                System.out.println(this.nationality);    //반복문 돌면서 계속 나오기 때문에 for문 밖에 배치 해야함.
    }

    public Dog getMyDog() {
        return myDog;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", myDog=" + myDog +
                '}';
    }
/* 강아지 이름을 입력받고, 입력받은 이름을 속성으로 강아지 객체 생성하여 이 사람의 강아지로 설정 */

    public void adoptDog(){
        Scanner sc = new Scanner(System.in);

        System.out.println("강아지의 이름을 입력하세요");
        String dogName = sc.nextLine();

        this.myDog = new Dog(dogName);

    }
    public void teachDog(String[] Skill) {
        /* 내 강아지의 재주를 설정 */
    this.myDog.setSkill(Skill);


    }

}







