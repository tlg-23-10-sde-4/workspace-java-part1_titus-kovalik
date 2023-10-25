/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Mr. Gram", LocalDate.of(1990, 8, 24),1888));
        dept.addEmployee(new HourlyEmployee("Mrs. Janice", LocalDate.of(2000, 2, 2),
                75, 20));
        dept.addEmployee(new HourlyEmployee("Pal", LocalDate.of(1856, 7, 15),
                0.5, 23.50));
        dept.addEmployee(new SalariedEmployee("Wannahockaloogie", LocalDate.of(1775, 7,4),
                300_000.50));

        // list its Employees
        System.out.println("\nList employees:\n");
        dept.listEmployees();
        System.out.println();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();
        System.out.println();

        System.out.println("Pay employees\n");
        dept.payEmployees();

    }
}