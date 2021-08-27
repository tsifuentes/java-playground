import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Option?\n 1 - Get value with .nextLine \n 2 - Get value with .nextInt");
        String option = scanner.nextLine();
        System.out.println("Ingrese valor");
        if(option.compareTo("1")==0) {
            scanner.reset();
            scannerLine(args, scanner);
            main(args);
        }
        else {
            scannerInt(args, scanner);
        }
    }

    public static void scannerInt(String[] args, Scanner scanner){
        try {
            int num = scanner.nextInt();
            String message = SistemasNumericos.print(num);
            System.out.println("message = " + message);
            main(args);
        } catch (InputMismatchException e){
            System.out.println("Error Scanner Int: " + e.getMessage());
            main(args);
            System.exit(0);
        }
    }

    public static void scannerLine(String[] args, Scanner scanner){
        try {
            String num = scanner.nextLine();
            String message = SistemasNumericos.print(Integer.parseInt(num));
            System.out.println("message = " + message);
        } catch (NumberFormatException e){
            System.out.println("Error Scanner Line: " + e.getMessage());
            main(args);
            System.exit(0);
        }
    }
}
