package com.tick;

/*
 * Class definition to model the workings of an alarm clock
 * This is called a "business class" or "system Class," as it contains
 * business things (attributes and methods).
 * This class definition does NOT have a main method, and most don't.
 */
class AlarmClock {
    //These are shared (static) variables - only one copy of these and they live in the class-wide common area
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;


    //properties or attributes  - in Java we call this "intances variables" or "fields"
    private int snoozeInterval = 5; // default value for when client doesn't specify one(instead of 0)]
    public int repeat = 5;



    //AlarmClock constructors, blank one creats a "Default" method call to get the default settings.
    //AlarmClock with argument in the paras makes it customizable (to the paramitor)
    public AlarmClock(){}
    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }
    public AlarmClock(int repeat, int snoozeInterval) {

    }

    // functions or operations -  in Java, we call these "methods"
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }
    public void repeat() {
        System.out.println("repeat ");
    }

    // accessor methods, they provide "controlled access to the objects fields
    // this allows us to do things like data validation, i.e.
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO: enforce the data constraint (if-else) -> must be between 1 and 20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval +
                    ". Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " minutes.");
        }
    }



    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}