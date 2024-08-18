package com.example.employees;

public class Manager extends Employee {

    public Manager (String name, int age, double salary){
        super(name, age, salary);
    }

    @Override
    public String getRole () {
        return "manager";
    }
    @Override
    public void performJob(){
        System.out.println(getName() + " is organising and overseeing a teem, projects, processes in the office" );
    }
    @Override
    public void describeRole() {
        super.describeRole();

    }
    @Override
    public void describeRole(String extraInfo) {
        System.out.println(getName() + " is a " + getRole() + " with a salary " + getSalary() + extraInfo);
    }
}

