package com.ohgiraffers.prectice.question;

public class Student extends Person{
    public Student(){
        super();
    }

    int grade;
    String major;

    public Student (String name,int age, double height, double weight,int grade,String major){
    super(age,height,weight);
        this.grade = grade;
        this.major = major;
        super.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getInformation(){
        return super.getInformation()
        +" " +"학년:"+ this.grade +" "
                +"전공:" + this.major;

    }

}


