import javax.swing.*;
public class L2E13 {
  public static void main(String[] args) {
    String dataInput, err = "n";
    int numberLength = 0;
    String inverted;
    dataInput = JOptionPane.showInputDialog("Digite um número de 4 digitos:");
    if(dataInput.matches(".*\\d.*")){
      numberLength = dataInput.length();
      if (numberLength == 4) {
        inverted = new StringBuilder(dataInput).reverse().toString();
        if (inverted.equals(dataInput)) {
          JOptionPane.showMessageDialog(null, String.format("Número palíndromo."));
        } else {
          JOptionPane.showMessageDialog(null, String.format("Número NÃO palíndromo."));
        }
      } else {
        JOptionPane.showMessageDialog(null, String.format("Número não é de 4 digitos."));
        err = "y";
      }
    } else {
      JOptionPane.showMessageDialog(null, String.format("Opção inválida"));
      err = "y";
    }
  }
}
