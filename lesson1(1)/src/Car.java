import java.util.ArrayList;

public class Car {
    //public String make;
    //public String model;
    //public int year;
    private String color;
    private double maxSpeed;
    private double currentSpeed;
    private int numberOfDoors;
    //ArrayList<Owner>Owners;

    //constructor
    Car(String color, double maxSpeed, int numberOfDoors, double currentSpeed){
    this.color = color;
    this.maxSpeed = maxSpeed;
    this.currentSpeed = currentSpeed;
    this.numberOfDoors = numberOfDoors;
        System.out.println("Car object made");
    }

    public void setCurrentSpeed(double speed) {
        if (speed < 0){
            currentSpeed = 0;
        }
        else if(speed > maxSpeed){
            currentSpeed = maxSpeed;
        }
        else{
            currentSpeed = speed;
        }
    }
    public double getCurrentSpeed(){return currentSpeed;}
}
