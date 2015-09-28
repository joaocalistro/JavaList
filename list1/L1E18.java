import javax.swing.*;
public class L1E18 {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Digite um número inteiro positivo:");
  int number = Integer.parseInt(dataInput);
  int square = (number * number);
  double squareRoot = Math.sqrt(number);
  JOptionPane.showMessageDialog(null, String.format("Número: %d\nQuadrado: %d\nRaiz quadrada: %.2f", number, square, squareRoot));
  }
}
