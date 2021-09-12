import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        arrayIntegers();
        arrayStrings();
    }

    public static void arrayIntegers() {
        int[] numbers = new int[4];

        numbers[0] = 12;
        numbers[1] = 11;
        numbers[2] = Integer.valueOf("13");
        numbers[numbers.length - 1] = 4;

        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        double[] emptyArray = new double[4];
        for (int i = 0; i < 4; i++) {
            emptyArray[i] = Math.random();
        }
        for (double number : emptyArray) {
            System.out.println("number emptyArray = " + number);
        }
    }

    public static void arrayStrings(){
        String[] strings = new String[5];

        strings[0] = "Kingston pendrive 440";
        strings[1] = "Samsung Galaxy";
        strings[2] = "Hard Disk SSD SE";
        strings[3] = "ASUS Notebook";
        strings[4] = "Macbook Air";

        Arrays.sort(strings);
        for(String string: strings){
            System.out.println("string = " + string);
        }

        String[] stringsDesc = {
                "Thomas", "Israel", "Nataly", "Rocio", "Norman", "Jose", "Rosa", "Jaris", "Nikis", "Carmen"
        };

        for (int i = stringsDesc.length-1; i >= 0; i--) {
            System.out.println("stringsDesc[ " + i + " ] = " + stringsDesc[i]);
        }
    }
}
