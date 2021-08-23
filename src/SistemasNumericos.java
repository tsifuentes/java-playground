public class SistemasNumericos {
    public static void main(String[] args) {
        int entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("Integer.toBinaryString(entero) = " + Integer.toBinaryString(entero));
        int binario = 0b1010;
        System.out.println("binario 1010 = " + binario);
        System.out.println("Integer.toOctalString(entero) = " + Integer.toOctalString(entero));
        int octal = 012;
        System.out.println("octal 012 = " + octal);
        System.out.println("Integer.toHexString(entero) = " + Integer.toHexString(entero));
        int hex = 0xA;
        System.out.println("hex 0xA= " + hex);
    }
}
