import javax.swing.*;

public class Operadores {
    public static void main(String[] args) {
        arithmetic();
        assignments();
        unaries();
        increaseDecrease();
    }

    public static void arithmetic(){
        int numberA = Integer.parseInt(JOptionPane.showInputDialog("Enter first Number"));
        int numberB = Integer.parseInt(JOptionPane.showInputDialog("Enter second Number"));

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
        int numberA = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive Number"));
        int numberB = Integer.parseInt(JOptionPane.showInputDialog("Enter a negative Number"));

        System.out.println("+number: (1)*A = " + (+numberA));
        System.out.println("-number: (-1)*A = " + (-numberA));
        System.out.println("+number: (1)*B = " + (+numberB));
        System.out.println("-number: (-1)*B = " + (-numberB));
    }

    public static void increaseDecrease(){
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
}
