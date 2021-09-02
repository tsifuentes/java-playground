import javax.swing.*;

public class ControlFlow {
    public static void main(String[] args) {
        checkYourGrade();
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
}
