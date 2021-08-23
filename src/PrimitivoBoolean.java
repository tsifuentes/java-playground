public class PrimitivoBoolean {
    public static void main(String[] args) {
        boolean boolValue = true; // false
        System.out.println("boolValue = " + boolValue);

        boolean boolCompare = 10 == Integer.parseInt("10");
        // > < != ==
        System.out.println("boolCompare = " + boolCompare);

        boolean boolBit = Boolean.parseBoolean("false");
        System.out.println("boolBit = " + boolBit);
        int boolClass = Boolean.compare(boolBit, boolCompare); // 0 if it is true
        System.out.println("boolBit = " + boolClass);
    }
}
