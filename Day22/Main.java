package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Right",5,30);
        System.out.println(car.getSteering());
        Car bmw = new Car("Straight",5,100,"BMW");
        System.out.println(bmw.getModel());
        System.out.println(bmw.getSteering());
        System.out.println(car.getSteering());


    }
}
