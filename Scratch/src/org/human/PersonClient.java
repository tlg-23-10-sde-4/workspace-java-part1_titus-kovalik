package org.human;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Bartholomew", LocalDate.of(1855, 12,25));
        System.out.println(p1);

        System.out.printf("%s is %s years old\n", p1.getName(), p1.getAge());
    }

}