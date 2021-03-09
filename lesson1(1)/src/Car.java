import java.util.ArrayList;

public class Car {
    //public String make;
    //public String model;
    //public int year;
    private String color;
    private double maxSpeed;
    private double currentSpeed;
    private int numberOfDoors;
    private static int carIDGenerator = 0;
    private int carID;
    Owner owner;
    //ArrayList<Owner>Owners;

    //constructor
    Car(String color, double maxSpeed, int numberOfDoors, double currentSpeed){
    this.color = color;
    this.maxSpeed = maxSpeed;
    this.currentSpeed = currentSpeed;
    this.numberOfDoors = numberOfDoors;
        //System.out.println("Car object made");
    carID = carIDGenerator;
    carIDGenerator++;
    }

    Car(){
        System.out.println("Default Constructor");
        carID = carIDGenerator;
        carIDGenerator++;
        color = "black";
        currentSpeed = 0;
    }

    public int getCarIDGenerator(){
        return carIDGenerator;
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

    public void setCurrentSpeed(){
        currentSpeed++;
    }
    public double getCurrentSpeed(){return currentSpeed;}

    public String toString(){
        return "Car ID: " +carID + "\n Color: " + color + "\nCurrent Speed " +currentSpeed;
    }
}
