package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wall = new Wall(5,  4);
        System.out.println(wall.getArea());

        wall.setHeight(-1.25);
        System.out.println(wall.getHeight());
    }
}
