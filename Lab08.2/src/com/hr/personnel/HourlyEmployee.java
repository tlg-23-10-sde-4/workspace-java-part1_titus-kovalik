package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    double rate;
    double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate) {
        this(name, hireDate);
        setRate(rate);
    }

    public  HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate, rate);
        setHours(hours);
    }

    public double getRate() {
        return rate;
    }

    private void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    private void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee: name=" + getName() +
                ", hire date=" + getHireDate() +
                ", rate=" + getRate() +
                ", hours=" + getHours();
    }
}