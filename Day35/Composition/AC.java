package com.company;

import java.awt.*;

public class AC {

    private String company;

    public AC(String company) {
        this.company = company;
    }

    public void switchOn(){
        System.out.println("AC switched on");
    }

    public void switchOff(){
        System.out.println("AC switched off");
    }
    public String getCompany() {
        return company;
    }

}
