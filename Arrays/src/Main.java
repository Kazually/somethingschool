import java.util.Arrays;
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
        /*int[] array = new int[10]; //how many positions
        int total = 0;
        int swap = 0;
        int e = 0;
        for (int que2 = 0; que2 < array.length; que2++) {
            array[que2] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            total = array[i] + total;
            System.out.println(total);
        }
        System.out.println("Average " + total / array.length);
        e = array[2];
        array[2] = array[4];
        array[4] = e;
        System.out.println(e);
        */
        int[] array = new int[10]; //how many positions
        int total = 0;
        int e = 0;
        for (int que2 = 0; que2 < array.length; que2++) {
            array[que2] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            total = array[i] + total;
        }
        System.out.println("Average " + total / array.length);
        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i] + "o");
        }
        e = array[2];
        array[2] = array[4];
        array[4] = e;
        System.out.println(e + " e");
        }
    }