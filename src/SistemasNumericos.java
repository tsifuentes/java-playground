import javax.swing.*;

public class SistemasNumericos {
    public static String print(int entero) {
        String enteroMsg = "Integer = " + entero;
        String binaryMsg = "Binary (" + entero + ") = " + Integer.toBinaryString(entero);
        String octalMsg = "Octal (" + entero + ") = " + Integer.toOctalString(entero);
        String hexMsg = "Hex (" + entero + ") = " + Integer.toHexString(entero);
        System.out.println(enteroMsg);
        System.out.println(binaryMsg);
        System.out.println(octalMsg);
        System.out.println(hexMsg);
        return enteroMsg + "\n" + binaryMsg + "\n" + octalMsg  + "\n" + hexMsg;
    }
}
