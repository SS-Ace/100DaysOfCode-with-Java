package com.company;

public class Main {


    public static String getDurationString(int min, int sec){
        int hours,minutes;
        if(min>=0 && sec >=0 && sec<=59){
            hours=(min/60);
            minutes=min%60;

            return hours+"h "+minutes+"m "+sec+"s ";

        }

        return "Invalid value";
    }

    public static String getDurationString(int sec){
        int minutes;
        if(sec >= 0){

            minutes=sec/60;

            sec=sec%60;

           return getDurationString(minutes,sec);


        }

        return "Invalid value";
    }
    public static void main(String[] args) {
	System.out.println(getDurationString(3945)) ;
        System.out.println(getDurationString(65,45));
    }
}
