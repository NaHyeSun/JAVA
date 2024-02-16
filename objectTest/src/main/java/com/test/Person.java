package com.test;

import java.util.Scanner;

public class Person {
    /* 사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스) ---- 캡슐화
     *  */

    private String name;
    private int age;
    private String nationality;
    private Dog myDog;

    public Person(String name, int age) {
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

        String[] national = new String[]{"Korea", "Japan", "China", "HongKong", "Turkey"};

        for (String nationalList : national) {               //향상된 for문 사용
            if (nationality.equals(nationalList)) {          //nationality = set에 넣을 값 . equals (nationalList )
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

    public void adoptDog() {
        Scanner sc = new Scanner(System.in);

        System.out.println("강아지의 이름을 입력하세요");
        String dogName = sc.nextLine();

        this.myDog = new Dog(dogName);

    }

    public void teachDog(String[] Skill) {
        /* 내 강아지의 재주를 설정 */
        this.myDog.setSkill(Skill);


    }

    /* 1. void 메소드 출력
    *  2. Dog 메소드를 String으로 변경하여 출력
    *     출력예시) 뽀삐는 앉아를 할 수 있어요 :) or 뽀삐는 짖어!를 배우지 않았어요.
    *  3. Dog 메소드를 boolean으로 변경하여 출력
          출력예시) 뽀삐는 앉아!를 배웠어요!! or 뽀삐는 짖어!를 할 수 없어요. */

    public void orderToDog() {

        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 재주를 시켜볼까요? ");
        String doSkill = sc.nextLine();

//        this.myDog.doSomeThingVoid(doSkill);        //1번

//        System.out.println(this.myDog.doSomeThingVoid2(doSkill));        //2번

        if(this.myDog.doSomeThingVoid3(doSkill)) {         //3번
            System.out.println(myDog.getName()+"는 " + doSkill + " 를 " + "배웠어요!!");
        }else {
            System.out.println(myDog.getName()+ "는 " + doSkill + "을 " + "할 수 없어요");

        }
    }


}














