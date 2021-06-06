package com.company;

import java.awt.*;

public class bedroom {

    private Door door;
    private AC ac;

    public bedroom(Door door, AC ac) {
        this.door = door;
        this.ac = ac;
    }

    public void entry(){
        door.doorOpen();
        ACon();
    }

    public void ACon(){
        ac.switchOn();
    }

}
