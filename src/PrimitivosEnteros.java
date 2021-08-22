public class PrimitivosEnteros {
    public static void main(String[] args) {
        System.out.println("BYTE =====================================================");
        byte byteValor = 127;
        System.out.println("Byte.BYTES = " + Byte.BYTES);
        System.out.println("Byte.SIZE = " + Byte.SIZE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("SHORT =====================================================");

        short shortValor = 3000;
        System.out.println("shortValor = " + shortValor);
        System.out.println("Short.BYTES = " + Short.BYTES);
        System.out.println("Short.SIZE = " + Short.SIZE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);

        System.out.println("INT =====================================================");
        int intValor = 2147483647;
        System.out.println("intValor = " + intValor);
        System.out.println("Integer.BYTES = " + Integer.BYTES);
        System.out.println("Integer.SIZE = " + Integer.SIZE);
        System.out.println("Integer Min Value = " + Integer.MIN_VALUE);
        System.out.println("Integer Max Value = " + Integer.MAX_VALUE);

        System.out.println("LONG ====================================================");
        long longValor = 2147483648L;
        System.out.println("longValor = " + longValor);
        System.out.println("Long.BYTES = " + Long.BYTES);
        System.out.println("Long.SIZE = " + Long.SIZE);
        System.out.println("Long Min Value = " + Long.MIN_VALUE);
        System.out.println("Long Max Value = " + Long.MAX_VALUE);

        System.out.println("Var No matter what value is assigned");
        var varValor = 2147483648L;
        var varValor2 = 2147483647;
    }
}
