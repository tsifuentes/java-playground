public class ConversionType {
    public static void main(String[] args) {
        String intStr = "10";
        String doubleStr = "1200.23e-3";
        String boolStr = "true"; // ignored case
        System.out.println("Integer.parseInt(intStr) = " + Integer.parseInt(intStr));
        System.out.println("Double.parseDouble(doubleStr) = " + Double.parseDouble(doubleStr));
        System.out.println("Boolean.parseBoolean(boolStr) = " + Boolean.parseBoolean(boolStr));
        
        int strIn = 100;
        double strDouble = 1.45e4;
        boolean strBool = true;
        System.out.println("Integer.toString(strIn) = " + Integer.toString(strIn));
        System.out.println("String.valueOf(strIn) = " + String.valueOf(strIn));
        System.out.println("Double.toString(strDouble) = " + Double.toString(strDouble));
        System.out.println("String.valueOf(strDouble) = " + String.valueOf(strDouble));
        System.out.println("Boolean.toString(strBool) = " + Boolean.toString(strBool));
        System.out.println("String.valueOf(strBool) = " + String.valueOf(strBool));
    }
}
