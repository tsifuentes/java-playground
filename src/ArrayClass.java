public class ArrayClass {
    public static void main(String[] args) {
        arrayIntegers();
    }

    public static void arrayIntegers(){
        int[] numbers = new int[4];

        numbers[0] = 12;
        numbers[1] = 11;
        numbers[2] = Integer.valueOf("13");
        numbers[numbers.length - 1] = 4;

        for (int number: numbers){
            System.out.println("number = " + number);
        }
    }
}
