public class Main
{
    public static void main( String[] args )
    {
        /*int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." ); */
        int room = 113;
        double specialdecimal = 2.71828;
        room = 113;
        String name = "Computer Science";
        int nameclass = name.indexOf(" ");
        String firstName = name.substring(0,nameclass);
        String lastName = name.substring(nameclass +1);
        System.out.println("I am in room #" + room);
        System.out.println(" ");
        System.out.println("E is close to " + specialdecimal);
        System.out.println(" ");
        System.out.println("I am learning slowly in about " + firstName + " "+ lastName);
    }
} 