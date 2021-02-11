public class Main {
    public static void main(String[] args) {
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
        System.out.println(false || !false); //! means not
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
        /* https://github.com/Kazually/somethingschool.git
         comments a line above code
         */
        /* Random numbers
        random between 0 to 9, 0-10, int goes to 1 less calculated by computer
        */
        int random;
        System.out.println((int)(Math.random()*10) + 1); //moves decimal by 1// "math"  double became int
    }
}
