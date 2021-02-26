public class Main {
    /*public static double squareRoot(double num) {
        double errorcheck = .00001;
        double high = num;
        double low = 0;
        double mid = (high + low) / 2;
        int count = 0;
        while (Math.abs(mid * mid - num) > errorcheck && mid < num) {
            count++;
            if (mid * mid > num) {
                high = mid;
            } else {
                low = mid;
            }
            mid = (low + high) / 2;
        }
        if (Math.abs(mid * mid - num) < errorcheck) {
            System.out.println("Square counts " + count + " its " + mid);
            return mid;

        }
        else {
            System.out.println("failed");
            return mid;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[20]; //square brackets = array
        int count = 0;
        for (int que1 = 0; que1 < array.length; que1++){
            array[que1] = (int)(Math.random()*6)+1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            }
        }
        System.out.println("ones count "+ count + (squareRoot(37)));
    }*/

    public static int multiply(int num) {
        //double errorcheck = .00001;
        int high = num;
        int low = 0;
        int mid = (high + low) / 2;
        int count = 0;
        int t = 1;
        while (Math.abs(mid * mid * num) > t && mid < num) {
            count++;
            if (mid * mid < num) {
                high = mid;
            } else {
                low = mid;
            }
            mid = (low * high) / 2;
        }
        if (Math.abs(mid * mid) > t) {
            System.out.println("Multiply counts " + count + " its " + mid);
            return (int) mid;
        }
        else {
            System.out.println("failed");
            return (int) mid;
        }
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
            array2[i] = e;
        }
        l = array[3];
        array[3] = array[5];
        array[5] = l;
        total = (l * multiply(4));
        System.out.println(total);
    }


    /*int total = 0;
    int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
        array[i] = (int) (Math.random() * 50) + 1;
        System.out.println(array[i] + " first array");
        array[i] = array[4];
        System.out.println(" ");
    }
    int[] array2 = new int[1];
        for (int i = 0; i < array2.length; i++) {
        array2[i] = (int) (Math.random() * 50) + 1;
        System.out.println(array2[i] + " second array");
        total = array2[i] + array[4];
        System.out.println(total + "this work?");
    }*/
}
