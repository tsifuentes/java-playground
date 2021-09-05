public class Arguments {
    public static void main(String[] args) {
        testValueAsArgument(17, "Oscar");
        testValueAsArgument(21, "Fabricio");

        int[] numbers = {1,3,5,7,9};
        System.out.println("Start reference");
        referenceAsArgument(numbers);
        System.out.println();
        referenceAsArgument(numbers);
        System.out.println("End reference");
        referenceAsArgumentImmutable(new int[]{1,2,3,4,5});
    }

    public static void testValueAsArgument(int age, String name){
        String isOlder = age >= 18 ? " is old enough": " is a teenager";
        System.out.println(name + isOlder );
    }

    public static void referenceAsArgument(int[] numbers){
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + "-");
            numbers[i] += 10;
        }
        System.out.println();
    }

    public static void referenceAsArgumentImmutable(int[] numbers) {
        for(int number: numbers) {
            System.out.print(number + " - ");
            number += 10;
        }
    }
}
