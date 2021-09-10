import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        int absolut = Math.abs(-12);
        System.out.println("absolut = " + absolut);

        double max = Math.max(1.3, 2.3);
        System.out.println("max = " + max);

        double min = Math.min(4.5, 1.1);
        System.out.println("min = " + min);

        double ceil = Math.ceil(2.4);
        System.out.println("ceil = " + ceil);

        double floor = Math.floor(3.5);
        System.out.println("floor 3.5 = " + floor);

        System.out.println("Math.PI = " + Math.PI);

        double sq = Math.sqrt(4);
        System.out.println("sq = " + sq);

        double degree = Math.toDegrees(1.57);
        System.out.println("degree = " + degree);
        degree = Math.round(degree);
        System.out.println("round degree = " + degree);

        double radians = Math.toRadians(90.00);
        System.out.println("radians = " + radians);

        System.out.println("Math.sin(radians) = " + Math.sin(radians));
        System.out.println("Math.cos(radians) = " + Math.cos(radians));

        double random = Math.random();
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("floor random = " + random);

        Random randomObj = new Random();
        int randomInt = 25 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);
    }
}
