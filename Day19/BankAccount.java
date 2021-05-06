package com.company;

public class BankAccount {

    private double balance;
    private String accountnumber;
    private String customername;
    private String email;
    private String phonenumber;

    public void setBalance(double balance){

        this.balance = balance;

    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setCustomername(String customername){

        this.customername = customername;
    }

    public void setEmail(String email){

        this.email = email;

    }



    public String getCustomername(){

        return this.customername;

    }

    public double getBalance(){

        return this.balance;

    }

    public String getEmail(){

        return this.email;

    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void withdraw(double withdrawalamount){

        if(this.balance - withdrawalamount < 0){

            System.out.println("Withdrawal not processed due to low balance Balance: "+String.format("%7f",this.balance));

        }

        else{
            this.balance = this.balance - withdrawalamount;
            System.out.println("Withdrawal: "+withdrawalamount+" New balance: "+String.format("%7f",this.balance));
        }

    }

    public void deposit(double depositamount){

        this.balance = this.balance + depositamount;
        System.out.println("Deposit: "+depositamount+" New balance: "+String.format("%7f",this.balance));
    }



}
