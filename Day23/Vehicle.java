package improved;

public class Vehicle {
    private String name;
    private String size;
    private int velocity;
    private int direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.velocity = 0;
        this.direction = 0;

    }

    public void steer(int direction){

        this.direction = this.direction + direction;
        System.out.println("Vehicle.steer(): "+this.direction+" degrees");
    }

    public void move(int velocity, int direction){

        this.velocity = velocity;
        this.direction = direction;
        System.out.println("Vehicle.move(): Moving at "+velocity+" in direction "+direction);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }

    public void stop(){

        this.velocity = 0;
    }
}
