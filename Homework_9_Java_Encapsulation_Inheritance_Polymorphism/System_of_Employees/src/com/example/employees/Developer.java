package com.example.employees;

public class Developer extends Employee {

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String getRole(){
        return "developer";
    }
    @Override
    public void performJob() {
        System.out.println(getName() + " is developing a software.");
    }
    @Override
    public void describeRole() {
        super.describeRole();

    }
    @Override
        public void describeRole(String extraInfo){
        System.out.println(getName() + " is a " + getRole() + " with a salary " + getSalary() + extraInfo);
    }
}



