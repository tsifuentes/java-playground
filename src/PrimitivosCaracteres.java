public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char charValue = ' ';
        char charValue2 = '\u0020';
        char charValue3 = '@';
        char charValue4 = 64;
        char charValue5 = '\b'; // \t \n \r
        System.out.println("charValue + charValue2 + charValue3 + charValue4 + charValue5 = " + charValue + charValue2 + charValue3 + charValue4 + charValue5);
        System.out.println("Character.BYTES = " + Character.BYTES);
        System.out.println("Character.SIZE = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
    }
}
