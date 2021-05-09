package com.company;

public class Vehicle {

    private String steering;
    private int gear;
    private double speed;

    public Vehicle(String steering, int gear, double speed){

        this.steering = steering;
        this.gear = gear;
        this.speed = speed;

    }

    public String getSteering() {
        return steering;
    }

    public int getGear() {
        return gear;
    }

    public double getSpeed() {
        return speed;
    }
}
