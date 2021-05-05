package com.company;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator calculator = new SimpleCalculator();
	calculator.setFirstNumber(5.0);
	calculator.setSecondNumber(4);
    System.out.println(calculator.getFirstNumber());
    System.out.println(calculator.getSecondNumber());
    System.out.println("add=" + calculator.getAdditionResult());
    System.out.println(calculator.getSubtractionResult());

    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println(calculator.getFirstNumber());
    System.out.println(calculator.getSecondNumber());
    System.out.println(calculator.getDivisionResult());
    System.out.println(calculator.getMultiplicationResult());


    }
}
