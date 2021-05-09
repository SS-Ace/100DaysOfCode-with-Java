package com.company;

public class Car extends Vehicle {

    private String model;

    public Car(String steering, int gear, double speed, String model) {
        super(steering, gear, speed);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

