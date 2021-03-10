import java.util.Arrays;

public class Main {

    public static int[] addnum(int[] array, int num){
        int[] newarray = new int[array.length + 1];
        for (int i = 0; i > array.length; i++){
            array[i] = newarray[i];
        }
        newarray[array.length] = num;
        return array;
    }

    public static void main(String[] args) {
        System.out.println("original " );
        int[] arr = new int[]{1,2,3,4};
        for (int i = 0; i < arr.length; i ++ ){
            System.out.println(arr[i]);
        }

        System.out.println();
        System.out.println("add: ");
        arr = addnum(arr, 5);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    /*
    public static void main(String[] args) {
        int[] array1 = new int[5];
        for (int que1 = 0; que1 < array1.length; que1++) {
            array1[que1] = (int) (Math.random() * 20) + 1;
            System.out.println(array1[que1]);
        }
        System.out.println(Arrays.toString(array1));
        array1 = Arrays.copyOf(array1, array1.length + 1); //create new array from old array and allocate one more element

        array1[array1.length - 1] = 4;
        System.out.println(Arrays.toString(array1));
    }

*/




    /*
    public static int multiply(int num) {
        //double errorcheck = .00001;
        int high = num;
        int low = 0;
        int mid = (high + low) / 2;
        int count = 0;
        int t = 0;
        while (Math.abs(mid * mid * num) > t) {
            count++;
            if (mid * mid < num) {
                high = mid;
            } else {
                low = mid;
            }
            mid = (low * high) * 2;
        }
        //if (Math.abs(mid * mid) > t) {
            //System.out.println("Multiply counts " + count + " its " + mid);
            //return (int) mid;
        //}
        return (int) mid;
    }

    public static void main(String[] args) {
        int total = 0;
        int e = 0;
        int l = 0;
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 1;
            System.out.println(array[i] + " first array");
        }
        int[] array2 = new int[7];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 50) + 1;
            System.out.println(array2[i] + " second array");
            array2[i] = l;
        }
        l = array[3];
        array[3] = array[5];
        array[5] = l;
        total = (l * multiply(4));
        System.out.println(total + " array5 * ");
        System.out.println(array[3]);
        System.out.println(array[5]);
    }
*/
    /*
    public static void main(String[] args) {
        int total = 0;
        int[] array = new int[6];
        int[] array2 = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 1;
            System.out.println(array[i] + " first array");
            array[i] = array2[0];
            System.out.println(" ");
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 50) + 1;
            System.out.println(array2[i] + " second array");
            total = array2[i] + array[4];
            System.out.println(total + "this work?");
        }
    }*/
}
