package org.human;

import java.time.LocalDate;
import java.time.Period;

/*
 *An immutable class, more accurately a class definition written in such a way,
 * That instances of it, once created, cannot have their properties changed.
 * There are simply no public methods to do so.
 */
class Person {
    //FIELDS
    private final String name;
    private final LocalDate birthdate;


    //CONSTRUCTORS
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    /*
     * Returns the persons age in whole years.
     * this is a derived property i.e. it is calculated and returned, not stored in a field
     *
     */
    public int getAge() {
        return Period.between(getBirthdate(), LocalDate.now()).getYears();
    }
    //ACCESSORS
    public String getName() {
        return name;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    //TO-STRING
    public String toString() {
        return String.format("Person: name=%s , birthDate=%s ", getName(), getBirthdate());
    }

}