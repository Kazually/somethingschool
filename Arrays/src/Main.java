import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*int[] array = new int[20]; //square brackets = array
        int count = 0;
    for (int que1 = 0; que1 < array.length; que1++){
        array[que1] = (int)(Math.random()*6)+1;
    }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            }
        }
    System.out.println("ones count "+count);

    //
        int[] array = new int[10]; //how many positions
        int total = 0;
        for (int que2 = 0; que2 < array.length; que2++) {
            array[que2] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            total = array[i] + total;
            System.out.println(total); // 1+2=3, 2+3=5, 3+5
        }
        System.out.println("Average " + total / array.length);
*/
        //swap
        int[] array = new int[10]; //how many positions
        int x = 24;
        int y = 89;
        int total = 0;
        int swap = 0;
        for (int que2 = 0; que2 < array.length; que2++) {
            array[que2] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            total = array[i] + total;
            System.out.println(total); // 1+2=3, 2+3=5, 3+5
            if (total == x) {
                System.out.println("workd " + total);
            }
            if (y == total){
                System.out.println("t");
            }
        }
        System.out.println("Average " + total / array.length);    //System.out.println("Average " + total / array.length);
        }
    }
    //for (int i = 0; i < array.length; i++){
//            if (array[i] == x){
//                swap = array[i];
//                System.out.println(array[i]);
//            }