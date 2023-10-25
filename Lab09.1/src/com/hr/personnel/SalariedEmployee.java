package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee() {
        super(); //super class constructor MUST be called whether typed or not
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
//        registerIn401K()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }
    //methods
    @Override
    public void pay() {
        System.out.printf("%s is paid salary %s \n", getName(), getSalary());
    }
    @Override
    public void payTaxes() {
        double taxes = salary*SALARIED_TAX_RATE;
        System.out.println(getName() + " paid $" + taxes + " in taxes");
    }

    @Override
    public double getStandardDeduction() {
        return 10000;
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }


}