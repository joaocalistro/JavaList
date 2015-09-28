import javax.swing.JOptionPane;
public class L2E1 {
  public static void main(String[] args) {
    String dataInput;
    dataInput = JOptionPane.showInputDialog ("Digite um número:");
    double number = Double.parseDouble(dataInput);
    if (number > 20) {
      JOptionPane.showMessageDialog(null, String.format("Número maior que 20.\n\nA metade do número é %.2f", number / 2));
    } else {
      JOptionPane.showMessageDialog(null, "Número menor que 20.");
    }
  }
}
