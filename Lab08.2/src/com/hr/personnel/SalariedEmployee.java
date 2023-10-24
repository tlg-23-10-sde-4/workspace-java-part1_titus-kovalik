package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double salary;

    public SalariedEmployee() {
        super(); //super class constructor MUST be called whether typed or not
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        //registerIn401K()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: name=" + getName() + ", hire date=" + getHireDate() + ", salary=" + getSalary();
    }
}