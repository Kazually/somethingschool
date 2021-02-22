public class Main {
    public static void main(String[] args) {
    int[] numbers = new int[21];
    String[] names;
    //example "success1"
    for (int success1 = 0; success1 < numbers.length; success1++){
        numbers[success1] = success1*3;
        System.out.println(success1);
    }
    for (int i = 0; i < numbers.length; i++){
        int random = (int)(Math.random()*5 + 1);
        System.out.println("index: " + i + "\tValue: " + random);
    }
    }
}
