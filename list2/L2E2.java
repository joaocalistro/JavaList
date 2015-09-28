import javax.swing.JOptionPane;
public class L2E2 {
  public static void main(String[] args) {
    String dataInput;
    dataInput = JOptionPane.showInputDialog ("Digite um número:");
    double number = Double.parseDouble(dataInput);
    if ( number % 2 == 0 ) {
      JOptionPane.showMessageDialog(null, "Número par.");
    } else {
       JOptionPane.showMessageDialog(null, "Número ímpar.");
    }
  }
}
