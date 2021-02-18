import java.awt.event.PaintEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int random;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Rock = 1, Paper = 2, Scissors = 3, Spock = 4, 5 = shrug");
        System.out.println(" ");
        System.out.println("| 1 |               " + "Rock  > Scissors" + " | Rock  < Paper" + " | Rock  > Spock");
        System.out.println(" ");
        System.out.println("| 2 |               " + "Paper > Rock" + " | Paper < Scissors" + " | Paper > Spock");
        System.out.println(" ");
        System.out.println("| 3 |               " + "Scissors > Paper" + " | Scissors < Rock" + " | Scissors < Spock");
        System.out.println(" ");
        System.out.println("| 4 |               " + "Spock  > Rock" + " | Spock  < Paper" + " | Spock  > Scissors");
        System.out.println(" ");
        String name = scanner.next();
        random = (int)(Math.random() * 5 + 1);
        System.out.println(random);
    }
}
