import javax.swing.*;

public class ControlFlow {
    public static void main(String[] args) {
        int option = Integer.parseInt(JOptionPane.showInputDialog("Choose an option: \n" +
                "1. Check your grade\n" +
                "2. Check a leap year\n" +
                "3. For loop\n" +
                "4. While / Do While\n"));
        switch (option) {
            case 1:
                checkYourGrade();
                break;
            case 2:
                checkLeapYear();
                break;
            case 3:
                forLoop();
                break;
            case 4:
                whileDoWhile();
                break;
            default:
                int tryAgain = JOptionPane.showConfirmDialog(null, "Would you like to try with another option?", "PLAYING WITH OPERATORS", 1);
                if(tryAgain == 0) {
                    main(args);
                } else {
                    JOptionPane.showMessageDialog(null, "Thanks for playing! Back soon!");
                }
                break;
        }

    }

    public static void checkYourGrade(){
        System.out.println("========= IF ELSE, IF ELSE IF=========");
        float grade = Float.parseFloat(JOptionPane.showInputDialog("Enter your grande"));
        if(grade >= 18.0) {
            System.out.println("Approved!, excellent grade!");
        } else if(grade > 16.0){
            System.out.println("Approved!, very good grade!");
        } else if (grade >= 14) {
            System.out.println("Approved!, good grade!");
        } else if (grade > 10.5) {
            System.out.println("Approved!, but you need to study harder");
        } else if (grade < 10) {
            System.out.println("Sorry, you have disqualified.");
        }
    }

    public static void checkLeapYear(){
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year"));
        if(year % 400 == 0 || (year % 4 == 0) && !(year % 100 == 0)){
            System.out.println("It is a Leap Year!");
        } else {
            System.out.println("Oww! It is not a leap year!");
        }
    }

    public static void forLoop(){
        for (int i = 0; i < 10; i++){
            System.out.println("Increasing at " + i);
        }

        for (int i = 10; i >=0; i--){
            System.out.println("Decreasing at " + i);
        }
        int i = 0; // after this i cannot be re-declared since it will exist in the method scope
        for(;;){
            if(i > 5) {
                System.out.println("Break loop");
                break;
            }
            System.out.println("Print without arguments at " + i);
            i++;
        }
        System.out.println("Value of i = " + i);

        for (int j = 0; j < i; j ++){
            if(j < 3) {
                System.out.println("We are ok, we are under 3: " + j);
                continue;
            }
            if(j ==5) {
                System.out.println("Cut over 5: " + j);
                break;
            }
            System.out.println("We are over 3: " + j);
        }

        for(int j = 0, k = 5; j < k; j++){
            System.out.println("Values i < k: " + j + " < " + k);
        }
    }

    public static void whileDoWhile(){
        boolean condition = true;
        int i = 0;
        while (condition) {
            if(condition) {
                System.out.println("Condition at " + i + " is: " + condition);
            }
            if(i > 5) {
                condition = false;
            }
            i++;
        }

        do {
            System.out.println("Print at least once at " + i);
            i ++;
        } while (i < 7);
    }
}
