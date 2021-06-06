package com.company;

public class Door

{

    private String color;

    public Door(String color) {
        this.color = color;
    }

    public void doorOpen(){
        System.out.println("Door is opened");


    }

    public void doorClose(){
        System.out.println("Door is closed");
    }
    public String getColor() {
        return color;
    }
}
