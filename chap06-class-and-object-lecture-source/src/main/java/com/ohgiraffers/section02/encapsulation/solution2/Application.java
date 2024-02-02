package com.ohgiraffers.section02.encapsulation.solution2;


public class Application {
    public static void main(String[] args) {

        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인";             //에러 발생 (private로 설정해뒀기 때문에)
//        monster1.hp = 200;                        //에러 발생

        monster1.setkinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

    }
}
