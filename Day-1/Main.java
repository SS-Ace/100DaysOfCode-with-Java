package com.company;

public class Main {
    //SpeedConverter
        public static long toMilesPerHour(double kilometersPerHour) {

            if (kilometersPerHour < 0) {
                return -1;
            } else {
                double mil = kilometersPerHour / 1.609;
                long res = Math.round(mil);
                return res;
            }
        }

        public static void printConversion(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");
            } else {
                System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
            }

        }


        public static void main(String[] args) {

            printConversion(54.12);
        }
    }
