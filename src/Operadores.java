import javax.swing.*;

public class Operadores {
    public static void main(String[] args) {
        int option = Integer.parseInt(JOptionPane.showInputDialog("Choose an option\n " +
                "1. Arithmetic\n" +
                "2. Assignments\n" +
                "3. Unary\n" +
                "4. Increase\\Decrease\n" +
                "5. Relational\n" +
                "6. Logical\n" +
                "7. Ternary\n" +
                "8. InstanceOf"));
        switch (option) {
            case 1: arithmetic(); break;
            case 2: assignments(); break;
            case 3: unaries(); break;
            case 4: increaseDecrease(); break;
            case 5: relational(); break;
            case 6: logical(); break;
            case 7: ternary(); break;
            case 8: instanceOf(); break;
        }
        int tryAgain = JOptionPane.showConfirmDialog(null, "Would you like to try with another option?", "PLAYING WITH OPERATORS", 1);
        if(tryAgain == 0) {
            main(args);
        }
    }

    public static void arithmetic(){
        int numberA = Integer.parseInt(JOptionPane.showInputDialog("Enter first Number"));
        int numberB = Integer.parseInt(JOptionPane.showInputDialog("Enter second Number"));
        System.out.println("************ARITHMETIC************");
        System.out.println("concatenate numberA + numberB = " + numberA + numberB);
        System.out.println("sum (numberA + numberB) before concat = " + (numberA + numberB));
        System.out.println("(numberA - numberB) = " + (numberA - numberB)); // it needs parenthesis since - is not a concat symbol
        System.out.println("numberA / numberB = " + numberA / numberB);
        System.out.println("numberA * numberB = " + numberA * numberB);
        System.out.println("numberA%numberB = " + numberA%numberB);
        if(numberB > 0){
            float resolve = numberA / numberB; // lose of data
            float resolve2 =(float) numberA /(float) numberB; // lose of data
            System.out.println("lose of data in resolve = " + resolve);
            System.out.println("ok resolve2 = " + resolve2);
        } else {
            System.out.println("numberB is 0");
        }
        if(numberA % 2 == 0) {
            System.out.println("numberA is even");
        } else {
            System.out.println("numberA is odd");
        }
        if(numberB % 2 == 0) {
            System.out.println("numberB is even");
        } else {
            System.out.println("numberB is odd");
        }
    }

    public static void assignments() {
        System.out.println("************ASSIGNMENTS************");
        int numberA = Integer.parseInt(JOptionPane.showInputDialog("Enter first Number"));
        int numberB = Integer.parseInt(JOptionPane.showInputDialog("Enter second Number"));
        System.out.println("numberA = " + numberA);
        System.out.println("numberB = " + numberB);
        System.out.println("(numberA += numberB) = " + (numberA += numberB));
        System.out.println("(numberA -= numberB) = " + (numberA -= numberB));
        System.out.println("(numberA *= numberB) = " + (numberA *= numberB));
        System.out.println("(numberA /= numberB) = " + (numberA /= numberB));
        System.out.println("(numberA %= numberB) = " + (numberA %= numberB));

        String string = "The";
        string += numberA;
        string += " is the first Number, then the";
        string += numberB;
        string += " is the second Number.";
        System.out.println("Topic = " + string);
    }

    public static void unaries(){
        System.out.println("************UNARY************");
        int numberA = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive Number"));
        int numberB = Integer.parseInt(JOptionPane.showInputDialog("Enter a negative Number"));

        System.out.println("+number: (1)*A = " + (+numberA));
        System.out.println("-number: (-1)*A = " + (-numberA));
        System.out.println("+number: (1)*B = " + (+numberB));
        System.out.println("-number: (-1)*B = " + (-numberB));
    }

    public static void increaseDecrease(){
        System.out.println("************INCREASE / DECREASE************");
        int numberA = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        System.out.println("Original numberA = " + numberA);

        int numberB = ++numberA;
        System.out.println("++numberA = " + numberB);
        System.out.println("New numberA = " + numberA);

        int numberC = numberA++;
        System.out.println("numberA++ = " + numberC);
        System.out.println("New numberA = " + numberA);

        int numberD = --numberA;
        System.out.println("--numberA = " + numberD);
        System.out.println("New numberA = " + numberA);

        int numberE = numberA--;
        System.out.println("numberA-- = " + numberE);
        System.out.println("Last numberA = " + numberA);

    }

    public static void relational(){
        System.out.println("************RELATIONAL************");
        int intVal = 10;
        byte byteVal = 3;
        float floatVal = 1.35e3f;
        double douVal = 1.34e-3;
        boolean boolVal = false;

        System.out.println(boolVal + " == false = " + (boolVal == false));
        System.out.println(boolVal + " == true = " + (boolVal == true));
        System.out.println("!" + boolVal + " = " + (!boolVal));
        System.out.println(intVal + " == " + byteVal + " = " + (intVal == byteVal));
        System.out.println(intVal + " != " + byteVal + " = " + (intVal != byteVal));
        System.out.println(floatVal + " > " + douVal + " = " + (floatVal > douVal));
        System.out.println(floatVal + " < " + douVal + " = " + (floatVal < douVal));
        System.out.println(floatVal + " >= " + douVal + " = " + (floatVal >= douVal));
        System.out.println(floatVal + " <= " + douVal + " = " + (floatVal <= douVal));
    }

    public static void logical(){
        System.out.println("************LOGICAL************");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("true && true || false = " + (true && true || false));
        System.out.println("(true && false) || false = " + ((true && false) || false));
        System.out.println("false || true && false || false = " + (false || true && false || false));
        System.out.println("(false || true) && true || false = " + ((false || true) && true || false));
        System.out.println("false || true && (false || false) = " + (false || true && (false || false)));
    }
    
    public static void ternary(){
        System.out.println("************TERNARY************");
        double grade1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first grade"));
        double grade2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second grade"));
        double grade3 = Double.parseDouble(JOptionPane.showInputDialog("Enter the third grade"));

        System.out.println("grade1 = " + grade1);
        System.out.println("grade2 = " + grade2);
        System.out.println("grade3 = " + grade3);
        double average = (grade1 + grade2 + grade3) / 3;
        String status = average > 10 ? "Approved" : "Rejected";
        System.out.println("average = " + average);
        System.out.println("status = " + status);
        
        double maxGrade = grade1 > grade2 ? grade1 : grade2;
        maxGrade = maxGrade > grade3 ? maxGrade : grade3;
        System.out.println("maxGrade = " + maxGrade);
    }

    public static void instanceOf(){
        String text = "Hello world";
        Integer integer = 7;
        Double doubleVal = 1.5e3;
        Float floatVal = 1.3e-3f;
        Object obj = "obj String type";
        Object intVal = 4;
        Number numberFloatVal = 3.4f;
        Number numberDoubleVal = 3.4e-40d;
        Number numberLongVal = 3234443;

        System.out.println("text instanceof String = " + text instanceof String);
        System.out.println("text instanceof Object = " + text instanceof Object);
        System.out.println("(integer instanceof Integer) = " + (integer instanceof Integer));
        System.out.println("(integer instanceof Object) = " + (integer instanceof Object));
        System.out.println("(integer instanceof Number) = " + (integer instanceof Number));
        System.out.println("(doubleVal instanceof Double) = " + (doubleVal instanceof Double));
        System.out.println("(doubleVal instanceof Number) = " + (doubleVal instanceof Number));
        System.out.println("(doubleVal instanceof Object) = " + (doubleVal instanceof Object));
        System.out.println("floatVal instanceOf Float = " + (floatVal instanceof Float));
        System.out.println("floatVal instanceOf Number = " + (floatVal instanceof Number));
        System.out.println("floatVal instanceOf Object = " + (floatVal instanceof Object));
        System.out.println("obj instanceof String = " + obj instanceof String);
        System.out.println("intVal instanceof Integer = " + (intVal instanceof Integer));
        System.out.println("numberFloatVal instanceof Float = " + (numberFloatVal instanceof Float));
        System.out.println("(numberDoubleVal instanceof Double = " + (numberDoubleVal instanceof Double));

    }
}
