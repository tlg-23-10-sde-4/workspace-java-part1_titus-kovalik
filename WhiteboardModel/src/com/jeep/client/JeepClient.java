package com.jeep.client;

import com.jeep.Jeep;
import com.jeep.Model;
import com.jeep.Trim;

class JeepClient {

    public static void main(String[] args) {
        System.out.println(Jeep.getInstanceCount() + " Jeeps");
        Jeep jeepTruck = new Jeep(Model.GLADIATOR, Trim.WILLYS, true, true, 14);

        System.out.println(jeepTruck.toString());

        jeepTruck.turnOn();
        jeepTruck.goForwards();
        jeepTruck.goesLeft();
        jeepTruck.fordsRiver();
        jeepTruck.goesRight();
        jeepTruck.rockCrawl();
        jeepTruck.turnOff();
        System.out.println();//for space

        //New Instance
        Jeep jeepWrangler = new Jeep(Model.WRANGLER, Trim.RUBICON, false, false, 12);

        System.out.println(jeepWrangler.toString());

        jeepWrangler.turnOn();
        jeepWrangler.goForwards();
        jeepWrangler.goesRight();
        jeepWrangler.fordsRiver();
        jeepWrangler.goesLeft();
        jeepWrangler.turnOff();
        System.out.println();//for space

        //New Instance
        Jeep jeepWrangler2 = new Jeep();

        System.out.println(jeepWrangler2);

        jeepWrangler2.turnOn();
        jeepWrangler2.goForwards();
        jeepWrangler2.goesRight();
        jeepWrangler2.fordsRiver();
        jeepWrangler2.turnOff();

        //Instance counter:
        System.out.println(Jeep.getInstanceCount() + " Jeeps");
    }
}