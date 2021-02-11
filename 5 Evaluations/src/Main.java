public class Main {
    public static void main(String[] args) {
        //Question 1
        int x = 5;
        int y = 7;
        System.out.println(((x*4) < (y + 15)) && x < y); //20, 22, and x is less than y
        System.out.println((x*5) < (y + 20) && x < y);

        //Question 2
        x = 10;
        y = 20;
        int z = 30;
        System.out.println((( x == y) || (x < z)) && (x*2 + y)/5 > z);
        System.out.println(((y*5 + x) < z));

        //Question 3
        boolean a = true;
        boolean b = false;
        System.out.println((a || b) && ((a == b) || a));
        System.out.println((b || a) && !a==b);

        //Question 4
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println((a == b) && (x * 4) == (y % 6) * 5); //20*5 = 100, 4*5 = 20,
        System.out.println((!a == !b) && (x*10) != (y % 5));

        //Question 5
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9,2)) <= 9 && (-4 <= 4))); // ,9.0
        System.out.println(Math.sqrt(Math.pow(30,2)) > 10);
    }
}
