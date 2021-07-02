package PolyExercise;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }


    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> startEngine()";
    }

    public String brake() {
        return "Car -> startEngine()";
    }

    public int getcylinders() {
        return this.cylinders;
    }

    public String getname() {
        return this.name;
    }
}
    class Mitsubishi extends Car {

        public Mitsubishi(int cylinders, String name){
            super(cylinders, name);
        }

        @Override
        public String startEngine(){
            return "Mitsubishi -> startEngine()";
        }

        @Override
        public String accelerate(){
            return "Mitsubishi -> accelerate()";
        }

        @Override
        public String brake(){
            return "Mitsubishi -> brake()";
        }
    }

class Holden extends Car {

    public Holden(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Holden -> accelerate()";
    }

    @Override
    public String brake(){
        return "Holden -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Ford -> accelerate()";
    }

    @Override
    public String brake(){
        return "Ford -> brake()";
    }
}
public class Main{
public static void main(String[] args){
    Car car = new Car(8, "Base car");
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());

    Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());

    Ford ford = new Ford(6, "Ford Falcon");
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());

    Holden holden= new Holden(6, "Holden Commodore");
    System.out.println(holden.startEngine());
    System.out.println(holden.accelerate());
    System.out.println(holden.brake());


}


}