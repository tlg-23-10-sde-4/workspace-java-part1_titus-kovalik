package com.jeep.test;

import com.jeep.Jeep;
import com.jeep.Model;
import com.jeep.Trim;

/**
 * JR: not thorough enough.
 * For proper BVT (Boundary Value Testing) of 'clearanceInches' property,
 * with range [12.0,20.0], we need to test:
 *  11.9,12.0  and  20.0, 20.1
 *
 * fordsRiver() and rockCrawl() never tested, and both have logic worthy of testing.
 */
class JeepValidationTest {
    public static void main(String[] args) {
        Jeep jeep = new Jeep(Model.WRANGLER, Trim.WILLYS, true, true, 12);
        Jeep jeep1 = new Jeep(Model.WRANGLER, Trim.WILLYS, true, true, 20);
        Jeep jeep2 = new Jeep(Model.WRANGLER, Trim.WILLYS, true, true, 11.9);
        Jeep jeep3 = new Jeep(Model.WRANGLER, Trim.WILLYS, true, true, 20.1);
        System.out.println();



        jeep.fordsRiver();
        jeep1.fordsRiver();
        jeep2.fordsRiver();
        jeep3.fordsRiver();

        jeep.rockCrawl();
        jeep1.rockCrawl();
        jeep2.rockCrawl();
        jeep3.rockCrawl();


    }

}