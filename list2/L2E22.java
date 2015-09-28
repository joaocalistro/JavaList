import javax.swing.*;
public class L2E22 {
  public static void main(String[] args) {
    String dataInput;
    double bigger1 = 0, bigger2 = 0, result = 0;
    dataInput = JOptionPane.showInputDialog("Digite o primeiro valor:");
    double number1 = Double.parseDouble(dataInput);;
    dataInput = JOptionPane.showInputDialog("Digite o segundo valor:");
    double number2 = Double.parseDouble(dataInput);;
    dataInput = JOptionPane.showInputDialog("Digite o terceiro valor:");
    double number3 = Double.parseDouble(dataInput);;
    if (number1 > number2 && number2 > number3) {
      bigger1 = number1;
      bigger2 = number2;
    } else if (number1 > number3 && number3 > number2) {
      bigger1 = number1;
      bigger2 = number3;
    } else if (number2 > number1 && number1 > number3) {
      bigger1 = number2;
      bigger2 = number1;
    } else if (number2 > number3 && number3 > number1) {
      bigger1 = number2;
      bigger2 = number3;
    } else if (number3 > number1 && number1 > number2) {
      bigger1 = number3;
      bigger2 = number1;
    } else if (number3 > number2 && number2 > number1) {
      bigger1 = number3;
      bigger2 = number2;
    }
    result = bigger1 + bigger2;
    JOptionPane.showMessageDialog(null, String.format("Resultado da soma dos 2 maiores é %.2f", result));
  }
}
