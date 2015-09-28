import javax.swing.JOptionPane;
public class L2E7 {
  public static void main(String[] args) {
    String dataInput;
    dataInput = JOptionPane.showInputDialog ("Digite um número:");
    double number = Double.parseDouble(dataInput);
    double result;
    if (number <= 0){
      JOptionPane.showMessageDialog(null, String.format("%.2f <= 0.\n\nO resultado é 0", number));
    } else if (number > 0 && number <= 10){
      result = 1 + number;
      JOptionPane.showMessageDialog(null, String.format("0 < %.2f <= 10.\n\nO Resultado é %.2f", number, result));
    } else if (number > 10){
      result = (number * number) /2;
      JOptionPane.showMessageDialog(null, String.format("10 < %.2f < infinito.\n\nO Resultado é %.2f", number, result));
    }
  }
}
