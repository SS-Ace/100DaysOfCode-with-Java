package com.company;

public class Main {

    public static void main(String[] args) {
	Door door = new Door("white");
	AC ac = new AC("Panasonic");
	bedroom bed = new bedroom(door, ac);
	bed.entry();


    }
}
