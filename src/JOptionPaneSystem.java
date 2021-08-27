import javax.swing.*;

public class JOptionPaneSystem {
    public static void main(String[] args) {
        String stringValue = javax.swing.JOptionPane.showInputDialog("Ingrese valor");
        String message = SistemasNumericos.print(Integer.parseInt(stringValue));
        JOptionPane.showMessageDialog(null, message);
    }
}
