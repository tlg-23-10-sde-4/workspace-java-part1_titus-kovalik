package com.jeep.client;

import com.jeep.Jeep;
import com.jeep.Model;
import com.jeep.Trim;

/**
 * JR: Shows basic test-drive of a few valid instances.
 * Would have been nice to see at least one of them ford the river or crawl the rocks,
 * but they didn't have enough clearance.
 * That would demonstrate the logic you put in there.
 */
class JeepClient {

    public static void main(String[] args) {
        System.out.println(Jeep.getInstanceCount() + " Jeeps");
        Jeep jeepTruck = new Jeep(Model.GLADIATOR, Trim.WILLYS, true, true, 14);

        System.out.println(jeepTruck.toString());

        jeepTruck.turnOn();
        jeepTruck.goForwards();
        jeepTruck.goLeft();
        jeepTruck.fordsRiver();
        jeepTruck.goRight();
        jeepTruck.rockCrawl();
        jeepTruck.turnOff();
        System.out.println();//for space

        //New Instance
        Jeep jeepWrangler = new Jeep(Model.WRANGLER, Trim.RUBICON, false, false, 12);

        System.out.println(jeepWrangler.toString());

        jeepWrangler.turnOn();
        jeepWrangler.goForwards();
        jeepWrangler.goRight();
        jeepWrangler.fordsRiver();
        jeepWrangler.goLeft();
        jeepWrangler.turnOff();
        System.out.println();//for space

        //New Instance
        Jeep jeepWrangler2 = new Jeep();

        System.out.println(jeepWrangler2);

        jeepWrangler2.turnOn();
        jeepWrangler2.goForwards();
        jeepWrangler2.goRight();
        jeepWrangler2.fordsRiver();
        jeepWrangler2.turnOff();

        //Instance counter:
        System.out.println(Jeep.getInstanceCount() + " Jeeps");
    }

}