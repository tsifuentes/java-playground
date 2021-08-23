public class PrimitivosFlotantes {
    public static void main(String[] args) {
        System.out.println("FLOAT ======================================");
        float floatValue = 1.2E-2f; // 1.2E2f = 120.0 (*10^2), 1.2E-2f = 0.012 (/10^2)
        System.out.println("floatValue = " + floatValue);
        System.out.println("Float.BYTES = " + Float.BYTES);
        System.out.println("Float.SIZE = " + Float.SIZE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("DOUBLE ======================================");
        double doubleValue = 1.234E10;
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("Double.BYTES = " + Double.BYTES);
        System.out.println("Double.SIZE = " + Double.SIZE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
    }
}
