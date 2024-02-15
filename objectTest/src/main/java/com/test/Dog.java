package com.test;

import java.util.Arrays;

public class Dog {
    /* 강아지 속성 : 이름(String), 재주(String[]) */

    private String name;
    private String[] skill;

    public Dog(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", skill=" + Arrays.toString(skill) +
                '}';
    }






      }

      /* 강아지의 정보가 출력되는 조회 메소드
      *  이름과 재주가 출력되도록 하기!!
      * (재주는 배열이기 때문에 for문 사용)
      * Arrays.toString() 사용 */




