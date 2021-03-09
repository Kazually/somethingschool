import java.util.ArrayList;
public class Owner{

    String name;
    Car[] cars;
    int index = 0;

    Owner(String name ){
        this.name = name;
        cars = new Car[2];
    }

    private Car[] addItem(Car car){
        Car[] returnVal = new Car[cars.length +1];
        return returnVal;
    }

    public void addCar(Car car) {
        if (index < 2){
            cars[index] = car;
            index++;
        }
        else {
            cars = addItem(car);

        }
    }
}