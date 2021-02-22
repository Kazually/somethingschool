import java.awt.event.PaintEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spock > Rock, Spock < Paper, Spock > Scissors. " +
                "Type end to end game");
        System.out.println("""
                |------------|
                |1 - Rock    |
                |2 - Scissors|
                |3 - Paper   |
                |4 - Spock   | 
                |------------|""");
        boolean RPSSe = true; //code keep going unless typed 'end'
        Scanner scan = new Scanner(System.in); //scans for user input
        while (RPSSe) {
            String Player = scan.next(); //looks for next input from player

            //player = rock
            if (Player.equals("1")) {
                //player input, then computer picks number,
                // checks if its a lost or tie
                int Computer = (int) (Math.random() * 4 + 1);
                System.out.println(Computer);

                if (Computer == 1)
                    System.out.println("Tie");
                if (Computer == 2)
                    System.out.println("You Win");
                else if (Computer == 3)
                    System.out.println("You Lose");
                else if (Computer == 4)
                        System.out.println("You Lose");
            }
            //player = scissors
            else if (Player.equals("2")) {

                int Computer = (int) (Math.random() * 4 + 1);
                System.out.println(Computer);

                if (Computer == 2)
                System.out.println("Tie");
                if (Computer == 1)
                    System.out.println("You Lose");
                else if (Computer == 3)
                    System.out.println("You Win");
                else if (Computer == 4)
                        System.out.println("You Lose");
            }
            //player = paper
            else if (Player.equals("3")) {

                int Computer = (int) (Math.random() * 4 + 1);
                System.out.println(Computer);

                if (Computer == 3)
                System.out.println("Tie");
                if (Computer == 2)
                    System.out.println("You Lose");
                else if (Computer == 1)
                    System.out.println("You Win");
                else if (Computer == 4)
                        System.out.println("You Win");
            }
            //player = Spock
            else if (Player.equals("4")) {

                int Computer = (int) (Math.random() * 4 + 1);
                System.out.println(Computer);

                if (Computer == 4)
                System.out.println("Tie");
                if (Computer == 2)
                    System.out.println("You Win");
                else if (Computer == 3)
                    System.out.println("You Lose");
                else if (Computer == 1)
                        System.out.println("You Win");
            }
            //if player doesnt want to play anymore, types end, then the while loop finishes
            else if (Player.equals("end")) {
                System.out.println("You ended game.");
                RPSSe = false;
            }
            //if player doesnt put 1-4 it says invalid
            else{
                System.out.println("Invalid. Rock = 1, Scissors = 2, Paper = 3, Spock = 4, end = end game");
            }
        }
    }
}