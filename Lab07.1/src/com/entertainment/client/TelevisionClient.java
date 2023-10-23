package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Application main-class, i.e., the class definition with the main() method.
 * Purpose: create a few instances of Television and give them a test-drive.
 */
class TelevisionClient {

    // application starting point - at runtime, the app starts here
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        // create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Cheese");
        tv1.setVolume(Television.MAX_VOLUME);

        tv1.turnOn();
        tv1.turnOff();

        Television tv2 = new Television("Sony", 101, DisplayType.OLED);
        tv2.turnOn();
        tv2.turnOff();

        Television tv3 = new Television("LG");
        tv3.setDisplay(DisplayType.CRT);

        tv3.turnOn();
        tv3.turnOff();
        //.toString
        System.out.println(tv1.toString());
        System.out.println(tv2);// .toString is implied if (tv2) is ALL that is inputted
        System.out.println(tv3);
        System.out.println(Television.getInstanceCount() + " instances");
    }
}