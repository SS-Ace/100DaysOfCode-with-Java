package com.company;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary){

        this.real = real;
        this.imaginary = imaginary;

    }

    public void add(double real, double imaginary){

        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber cn){

        add(cn.real, cn.imaginary);
    }

    public void subtract(double real, double imaginary){

        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber cn){

        subtract(cn.real, cn.imaginary);

    }


}

