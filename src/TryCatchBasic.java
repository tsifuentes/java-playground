import javax.swing.*;

public class TryCatchBasic {
    public static void main(String[] args) {

        String stringValue = javax.swing.JOptionPane.showInputDialog("Ingrese valor");
        try {
            String message = SistemasNumericos.print(Integer.parseInt(stringValue));
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, enter a number " + e.getMessage());
        }
    }
}
