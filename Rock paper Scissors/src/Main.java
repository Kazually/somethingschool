import java.awt.event.PaintEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spock > Rock, Spock < Paper, Spock > Scissors");
        System.out.println("""
                |------------|
                |1 - Rock    |
                |2 - Scissors|
                |3 - Paper   |
                |4 - Spock   | 
                |------------|""");
        int random;
        int Pwin, Cwin, Player, Computer;
        Pwin = 0;
        Cwin = 0;
        Player = 0;
        Computer = 0;
        while (Math.abs(Cwin - Pwin) < 3){
            Scanner input = new Scanner (System.in);
            Player = input.nextByte();
            Computer = (int)(Math.random() * 5 + 1);
            if (Player == Computer)
                if(Computer == 1){
                    System.out.println("tie");
                }
                else if (Computer == 2){
                    System.out.println("tie");
                }
                else if(Computer == 3){
                    System.out.println("tie");
                }
                else{
                    System.out.println("tie");
                }
                //player = 1
            else if(Player == 1){
                if (Computer == 2){
                    System.out.println("win");
                    Pwin ++;
                }
                else if (Computer == 3){
                    System.out.println("lose");
                    Cwin ++;
                }
                else{
                    System.out.println("Lose");
                    Cwin ++;
                }
            }
            //player = 2
            else if(Player == 2){
                if (Computer == 3){
                    System.out.println("Win");
                    Pwin ++;
                }
                else if (Computer == 4){
                    System.out.println("lose");
                    Cwin ++;
                }
                else{
                    System.out.println("win");
                    Pwin ++;
                }
            }
            //player = 3
            else if(Player == 3){
                if (Computer == 4){
                    System.out.println("win");
                    Pwin ++;
                }
                else if (Computer == 2){
                    System.out.println("lose");
                    Cwin ++;
                }
                else{
                    System.out.println("win");
                    Pwin ++;
                }
            }
            //player = 4
            else if(Player == 4){
                if (Computer == 1){
                    System.out.println("lose");
                    Cwin ++;
                }
                else if (Computer == 2){
                    System.out.println("lose");
                    Cwin ++;
                }
                else{
                    System.out.println("Win");
                    Cwin ++;
                }
            }
        }
    }
}