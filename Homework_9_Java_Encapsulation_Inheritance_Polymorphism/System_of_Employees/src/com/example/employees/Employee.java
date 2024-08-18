package com.example.employees;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee (String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void work() {
        System.out.println(name + " is working.");
    }

    public void takeBreak() {
        System.out.println(name + " is taking a break.");
    }

    public void performJob() {
        System.out.println(name + " is performing job.");
    }

    public void describeRole() {
        System.out.println(name + " is a " + getRole());
    }

    public void describeRole(String extraInfo) {
        System.out.println(name + " is a " + getRole() + " with a salary " + getSalary() + extraInfo);
    }

    public String getRole() {
        return "employee";
    }
}
