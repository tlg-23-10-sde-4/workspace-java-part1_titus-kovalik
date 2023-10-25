package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    //Constructors
    public Executive() {
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " Enjoying a nice round of golf");
    }
}