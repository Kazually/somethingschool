public class Main {
        public static int[] number(int[] inputArray, int num){
            int[] outPutarray = new int[inputArray.length + 1];
            return outPutarray;
        }
    public static void main(String[] args) {
        int l = 0;
        //int y = 0;
        int total = 0;
        int[] array = new int[6];
        //boolean red = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 1;
            array[i] = array[4];
            System.out.println(array[i] + " first array");
        }
        //l = array[4];
        //int k = 0;
        //int called = 0;
        int[] array2 = new int[1];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 50) + 1;
            System.out.println(array2[i] + " second array");
            total = array2[i] + array[4];
            System.out.println(total + "this work?");
        }

    /*public static int num(int[] inputArray, int num){
        int[] outputArray = new int[inputArray.length +1];
        return outputArray;*/
    }
}
