package com.example.employees;

public class Designer extends Employee {
    public Designer (String name, int age, double salary) {
        super(name, age, salary);
    }
    @Override
    public String getRole(){
        return "designer";
    }
    @Override
    public void performJob() {
        System.out.println(getName() + " is designing a website.");
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


