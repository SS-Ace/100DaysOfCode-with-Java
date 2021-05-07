package com.company;

public class Wall {

    private double width;
    private double height;

    public Wall(){

    }

    public Wall(double width, double height){
        if(width < 0){

            this.width = 0;
        }

        if(height < 0){
            this.height = 0;
        }

        if(width >= 0) {
            this.width = width;

        }

        if(height >= 0){

            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {

        if(width < 0){

            this.width = 0;
        }
        else {
            this.width = width;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {

        if(height < 0){

            this.height = 0;
        }
         else {
            this.height = height;
        }
    }

    public double getArea(){

        return (this.height * this.width);
    }
}
