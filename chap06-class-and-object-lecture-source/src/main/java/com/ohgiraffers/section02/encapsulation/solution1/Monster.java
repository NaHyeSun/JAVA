package com.ohgiraffers.section02.encapsulation.solution1;

public class Monster {

//    String name;
//    int hp;

//    String kinds;
//    int hp;

//    public void setInfo(String info){
//        this.name = info;
//    }
//    public void setHp(int hp){
//        if(hp >= 0){
//            this.hp = hp;
//        }else {
//            this.hp = 0;
//        }
//    }
//    public String getInfo() {
//        return "몬스터의 이름은" + " " + this.name + "이고, 체력은" + this.hp + "입니다. ";

    String kinds;                  //name을 kinds로 변경해도 Application 실행에 문제가 없다.
    int hp;
    public void setInfo(String info){
        this.kinds = info;
    }
    public void setHp(int hp){
        if(hp >= 0){
            this.hp = hp;
        }else {
            this.hp = 0;
        }
    }
    public String getInfo() {
        return "몬스터의 이름은" + " " + this.kinds + "이고, 체력은" + this.hp + "입니다. ";
    }
}
