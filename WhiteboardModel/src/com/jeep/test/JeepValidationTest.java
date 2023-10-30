package com.jeep.test;

import com.jeep.Jeep;
import com.jeep.Model;
import com.jeep.Trim;

class JeepValidationTest {
    public static void main(String[] args) {
        Jeep jeep = new Jeep(Model.WRANGLER, Trim.WILLYS, true, true, 11);
        jeep = new Jeep(Model.WRANGLER, Trim.WILLYS, true, true, 20);
        jeep = new Jeep(Model.WRANGLER, Trim.WILLYS, true, true, 9);
        jeep = new Jeep(Model.WRANGLER, Trim.WILLYS, true, true, 21);

    }

}