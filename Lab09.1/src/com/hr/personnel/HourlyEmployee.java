package com.hr.personnel;

import gov.irs.TaxPayer;

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
    //methods
    @Override
    public void pay() {
        double payment = rate*hours;
        System.out.println(getName() + " is paid hourly, " + payment);
    }
    @Override
    public void payTaxes() {
        double taxes = rate*HOURLY_TAX_RATE;
        System.out.println(getName() + " paid $" + taxes + " in taxes");
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
        return super.toString() +
                ", rate=" + getRate() +
                ", hours=" + getHours();
    }


}