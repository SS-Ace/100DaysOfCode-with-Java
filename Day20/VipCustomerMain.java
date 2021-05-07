package com.company;

import javax.sound.midi.spi.SoundbankReader;

public class VipCustomerMain {

    public static void main(String[] args) {
        VipCustomer vip = new VipCustomer("Rajan Roni", 90, "rajanr@vip.com");
        System.out.println(vip.getName()+" "+vip.getCredit_limit()+" "+vip.getEmail());
        VipCustomer vip2 = new VipCustomer();
        System.out.println(vip2.getName()+" "+vip2.getCredit_limit()+" "+vip2.getEmail());
        VipCustomer vip3 = new VipCustomer("Rany Ron", 75);
        System.out.println(vip3.getName()+" "+vip3.getCredit_limit()+" "+vip3.getEmail());

    }
}
