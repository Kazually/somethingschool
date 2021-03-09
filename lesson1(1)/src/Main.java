import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //methods
    //this wont run unless called
    // int, void
    /*public static int returnfive(){
        System.out.println("hello");
        return 5;
    }*/
    /*
    calculates sqaure root of positive, perfect square, if num is not positive,
    perfect square it returns -1
    brute force algorithm/guess and check
     */
    /*public static int[] number(int[] inputarray, int num) {
        int[] outputarray = new int[inputarray.length + 1];
        //in a for loop copy the input array to the output array
        //return the array
        return outputarray;
    }

    //public static int sqrt(int num){
    //double guess = 0;
    //int increment = 1;
    //double low = 0;
    //double high = num;
    //double mid = (low + high) / 2;
    //double increment = .000000001;
    //int count = 0;
    //double error = .000001;
        /*while ( (Math.abs((guess * guess - num)) > error) && (guess * guess < num)){ //guess * guess < num previously here
            guess += increment;
            count++;
        }
        while ( (Math.abs((mid * mid - num)) > error) && (mid < num)){
        if (mid * mid > num){
        high = mid;
        mid = (low + high) /2;
        }
        else if (mid * mid < num){
            low = mid;
        }
        }
            System.out.println(count);
        return guess;
        //if ((guess * guess) == num) {
        //    return guess; //once it reaches desired, code stops no matter what
        //} else {
        //    return -1;
        //}*/
    /*public static int sqrt(int num) {
        int guess = 0;
        int increment = 1;
        while (guess * guess < num) {
            guess = guess + increment; // instead of just = its += increment(orwhatever)
        }
        if ((guess * guess) == num) {
            return guess; //once it reaches desired, code stops no matter what
        } else {
            return -1;
        }
    }

            public static void main(String[] args) {
                System.out.println("inside");
                System.out.println(sqrt(144));

    //public static void main(String[] args) {
        //System.out.println(sqrt(144)); // 200 = -1
        //int x = returnfive();
        //public static int[] deletenumber(int[] inputarray){

        }
        //public static int[] insertnumber(int[] inputarray, int num)
        //int numbers [] = new int[];



        /*System.out.println("whatever copycat");
        "psvm" then press 'tab' key
        //le note:expressions
        //operand<operator>operand
        //3+4 (like math)
        //primitive datatypes
        //intergers (non decimal numbers), floats (decimals). booleans (true/false), char
        System.out.println((3+4)*5);
        System.out.println(19.0/10);  //interger math, if need decimal add zero
        System.out.println(Math.sqrt(25) +10); //evaluate ^ basically the same
        System.out.println(15.0); //^ the same basically
        " " like these count as a variable, ex. System.out.println("I am learning slowy in about " + firstName + " "+ lastName);
        creates space
        */

        //Variables
        //always have a good name. basic concept of data (meaning)
        //abstraction
        //avoid bad names, x, yes
        /*int num = 10;
        double decimal = 1.5;
        boolean isFlying = true;
        int numhotdogs = 0;
        double hotdogPrice = 2.5;
        double taxrate = 1.12;
        double totalprice;
        totalprice = numhotdogs * hotdogPrice *taxrate;
        //^these now have meaning
        numhotdogs = 5;
        System.out.println("You owe: $" + totalprice);
        //reference data
        String name = "Yeet Him";
        int nameindex = name.indexOf(" ");
        String firstName = name.substring(0,nameindex);
        String lastName = name.substring(nameindex +1);
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName); */
        /* ++, --
        int number = 6;
        int addOn = 5;
        number = number + addOn;
        number += addOn; //all normal operators
        comparative operators
        >,<, >=, <=, ==, /=
        these will always evaluate to true or false
        System.out.println(Math.sqrt(255) <= Math.pow(5,7)/2);
        System.out.println(10 != 10);*/
        /* logical operators
        and &&, or||
        boolean &&/|| boolean
        && if both are true then it is true
        if || one of them is true then the whole thing is true

        System.out.println( 5< 10 || 10 > 8);
        System.out.println(5< 10 && 10 > 8);
        System.out.println(false || !false); //!= does not equal to
        System.out.println(!false != false);
        modulus 2 divide by 3 equals 0 remainder 2 (would be 0-4)

        System.out.println(1%3);
        System.out.println(2%3);
        System.out.println(3%3);
        System.out.println(4%3);
        System.out.println(5%3);
        System.out.println(6%3);
        System.out.println(7%3);
        int hour = 1;
        int minute = 30;
        int addhour = 250/60; //4 evaluated
        int addminute = 250 % 60; //10 evaluated, 10 is remainder
        hour += addhour;
        minute += addminute;
        System.out.println(hour + ":" + minute); */



        /* Random numbers
        random between 0 to 9, 0-10, int goes to 1 less calculated by computer
        */
        //int random;
        //System.out.println((int)(Math.random()*10) + 1); //moves decimal by 1// "math"  double became int

        //array [] inside means how many of these, ends 1 less than desired number
        /*int[] numbers = new int[10];
        String[] names;
        for (int i = 0; i < numbers.length; i++){ //can put any variable in i slot, if put 11 its an error, length = no out of bounds
            numbers[i] = i*3;
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Index: " + i + "\tValue: " + numbers);
        } */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("index");
        String name = scanner.next();
        int age = scanner.next();
         */
        //public static void main(String[] args) {
            //String, int[], other datatypes
                //ArrayList<Owner> list = new ArrayList<>();
                //Owner person = new Owner("Jim Bob");
                //list.add(person);
                //for (int i = 0; i< 10; i++);
                //list.add(new Owner("Owner" + 1));

          //  }
            //Owner owner1 = list.get(5);
            //owner1.setname("Jimmy Bobby")
          public static void main(String[] args) {
              /*Car car = new Car("blue", 100, 4, 0);
              System.out.println(car.getCurrentSpeed());
              car.setCurrentSpeed(20);
              System.out.println(car.getCurrentSpeed());
              System.out.println(car);
              Car carl = new Car("red", 20, 1, 0);
              */
              /*Car car = new Car();
              Car car2 = new Car();
              System.out.println(car.getCarIDGenerator());
              System.out.println(car2.getCarIDGenerator());**/
              for (int i = 0; i < 9; i++){
                  Car car = new Car();
                  System.out.println(car);
              }
          }
}
