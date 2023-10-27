package com.transportation;

class Boat extends Vehicle {


    public Boat(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        System.out.println("Boat paddles through, over, or under anything to get to " + location);
    }
}