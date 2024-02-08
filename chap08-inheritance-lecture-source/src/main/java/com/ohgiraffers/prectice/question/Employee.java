package com.ohgiraffers.prectice.question;

public class Employee extends Person {
    public Employee (){
        super();
    }
    int salary;
    String dept;

    public Employee (String name,int age,double height, double weight, int salary,String dept){
        super(age,height,weight);
        this.salary = salary;
        this.dept = dept;
        super.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    @Override
    public String getInformation(){
        return super.getInformation()
                +" " +"급여:"+this.salary
                +"부서:" + this.dept;

    }
}
