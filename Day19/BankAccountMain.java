package com.company;

public class BankAccountMain {
    public static void main(String[] args){

        BankAccount newaccount = new BankAccount();
        newaccount.setAccountnumber("1324567543");
        System.out.println(newaccount.getAccountnumber());
        newaccount.setCustomername("Rahul Samuel");
        System.out.println(newaccount.getCustomername());
        newaccount.setEmail("rahul.12@test.com");
        System.out.println(newaccount.getEmail());
        newaccount.setPhonenumber("9192312342");
        System.out.println(newaccount.getPhonenumber());
        newaccount.setBalance(10000);
        System.out.println(String.format("%7f",newaccount.getBalance()));
        newaccount.withdraw(110000d);
        newaccount.deposit(120000d);
        newaccount.withdraw(110000d);




    }
}
