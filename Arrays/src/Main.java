import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    /*int[] array = new int[20]; //square brackets = array
        int count = 0;
    for (int que1 = 0; que1 < array.length; que1++){
        array[que1] = (int)(Math.random()*6)+1;
        System.out.println(que1);
    }
    for (int i = 0; i < array.length; i++){
    if (array[i] == 1){
        count ++;
    }
    }
    System.out.println("ones count "+count);

        int[] array = new int[10]; //how many positions
        int count = 0;
        int total = 0;
        for (int que2 = 0; que2 < array.length; que2++) {
            array[que2] = (int) (Math.random() * 100) + 1;
            System.out.println(array[que2]);
        }
        for (int i = 0; i < array.length; i++) {
            total = array[i] + total;
            System.out.println(total); // 1+2=3, 2+3=5, 3+5
        }
        System.out.println(total / array.length);
    }*/
        //swap
        int[] array = new int[10]; //how many positions
        int x = 40;
        int y = 60;
        int swap = 0;
        for (int que2 = 0; que2 < array.length; que2++) {
            array[que2] = (int) (Math.random() * 100) + 1;
            System.out.println(array[que2]);
            for (int i = 0; i < array.length; i++){
                //if (array[que2] == x){
                  //     array[que2] = y;
                    //    System.out.println("Answer" + array[que2]);
            }
            if (array[que2] == x){
                array[que2] = y;
                array[que2] = x;
                System.out.println(y);
                System.out.println("Answer" + array[que2]);
            }
        }
    }
}