package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    // OPTION 1 try-catch and use finally to insure it calls stop()

//    public void goToWork() {
//        Car jeep = new Car("ABC123", "Jeep", "Gladiator");
//            jeep.start();
//        try {
//            jeep.moveTo("west seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e);
//        }
//        finally {
//            jeep.stop();
//        }
//    }
    // Option 2 "Not dealing with it" use a try-finally to make sure stop() gets called in client
//    public void goToWork() throws DestinationUnreachableException {
//        Car jeep = new Car("ABC123", "Jeep", "Gladiator");
//        try {
//            jeep.start();
//            jeep.moveTo("west seattle");
//        }
//        finally {
//            jeep.stop();
//        }
//    }
    // OPTION 3 catch the exception, "respond" in some way, then rethrow it
    // we still use finally for the guarantee to call stop()

//    public void goToWork() throws DestinationUnreachableException {
//        Car jeep = new Car("ABC123", "Jeep", "Gladiator");
//            jeep.start();
//        try {
//            jeep.moveTo("west seattle");
//        } catch (DestinationUnreachableException e) {
//            //use JavaMail API to send email to city counsel to complain
//            throw e;
//        }
//        finally {
//            jeep.stop();
//        }
//    }
    // OPTION 4: try-catch the exception, then throw a different one.
    //instead of re-throwing this low-level transportatio-oriented exception,
    //we'll throw an HR oriented exception instead
    public void goToWork() throws WorkException {
        Car jeep = new Car("ABC123", "Jeep", "Gladiator");
        jeep.start();
        try {
            jeep.moveTo("Monroe");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        }
        finally {
          jeep.stop();
        }
}




    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}