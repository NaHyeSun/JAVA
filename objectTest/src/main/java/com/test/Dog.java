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
    /* 강아지의 정보가 출력되는 조회 메소드
     *  이름과 재주가 출력되도록 하기!!
     * (재주는 배열이기 때문에 for문 사용)
     * Arrays.toString() 사용 */

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", skill=" + Arrays.toString(skill) +
                '}';

    }

    /* Dog 의 반환 타입인 void인 메소드 호출 */
    public void doSomeThingVoid(String doSkill) {

        /* switch문 사용 작성 */

        switch (doSkill) {
            case "앉아": doSkill = "앉아";break;
            case "빵": doSkill= "빵";break;
            case "기다려": doSkill = "기다려";break;
            default:
                System.out.println("아직 못배운 재주에요");
                return;

        }
        System.out.println(getName() + "는 " + doSkill + " 를" + " 할 수 있어요");

    }
    /* String 타입 메소드로 호출 */
    public String doSomeThingVoid2(String doSkill) {

        switch (doSkill) {
            case "앉아"
                    : return name+ "는" + "앉아를 할 수 있어요";
            case "빵"
                    : return name + "는"+ "빵을 할 수 있어요";
            case "기다려"
                    : return name + "는"+ "기다려를 할 수 있어요";
            default:
                return name + "는" + doSkill + "을 배우지 않았어요";

        }

    }
    /* boolean 타입 메소드로 호출 */

    public boolean doSomeThingVoid3(String doSkill) {

        switch (doSkill) {
            case "앉아"
                    : return true;
            case "빵"
                    : return true;
            case "기다려"
                    : return true;
            default:
                return false;

        }

    }
  }






