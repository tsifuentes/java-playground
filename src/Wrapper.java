import java.lang.reflect.Method;

public class Wrapper {
    public static void main(String[] args) {
        boxingInt();
        unboxInt();
        getClassInt();
    }

    public static void boxingInt(){
        Integer objInt = new Integer(12345);
        Integer objInt2 = Integer.valueOf(12345);
        Integer objInt3 = 12345; // autoboxing
        Integer objInt4 = Integer.valueOf("12345");

        System.out.println("objInt1 instanceof Integer = " + (objInt instanceof Integer));
        System.out.println("objInt2 instanceof Integer = " + (objInt2 instanceof Integer));
        System.out.println("objInt3 instanceof Integer = " + (objInt3 instanceof Integer));
        System.out.println("objInt4 instanceof Integer = " + (objInt4 instanceof Integer));

        System.out.println("objInt3.toString() = " + objInt3.toString());
        System.out.println("objInt3.doubleValue() = " + objInt3.doubleValue());
        System.out.println("objInt3.floatValue() = " + objInt3.floatValue());
        System.out.println("objInt3.longValue() = " + objInt3.longValue());
        System.out.println("objInt3.intValue() = " + objInt3.intValue());
        System.out.println("objInt3 == objInt2 = " + (objInt3 == objInt2));
        System.out.println("objInt3.intValue() == objInt4.intValue() = " + (objInt3.intValue() == objInt4.intValue()));
    }

    public static void unboxInt() {
        Integer objInt = Integer.valueOf(1243);
        int intValue = objInt;
        System.out.println("intValue == objInt = " + (intValue == objInt));
        System.out.println("intValue == objInt.intValue() = " + (intValue == objInt.intValue()));
    }

    public static void getClassInt(){
        Integer objInt = 12343;
        Class intClass = objInt.getClass();
        System.out.println("intClass = " + intClass);
        System.out.println("intClass.getName() = " + intClass.getName());
        for(Method m: intClass.getMethods()){
            System.out.print(" | " + m.getName());
        }
        System.out.println();
        System.out.println("intClass.getPackage() = " + intClass.getPackage());
    }
}
