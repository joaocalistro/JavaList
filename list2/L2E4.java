import javax.swing.*;
import java.awt.*;
public class L2E4 {
  public static void main(String[] args) {
  JTextField number1Frm = new JTextField(8);
  JTextField number2Frm = new JTextField(8);

  JPanel myPanel = new JPanel();
  myPanel.add(new JLabel("Primeiro número:"));
  myPanel.add(number1Frm);
  myPanel.add(Box.createHorizontalStrut(15));
  myPanel.add(new JLabel("Segundo número:"));
  myPanel.add(number2Frm);

  int result = JOptionPane.showConfirmDialog(null, myPanel,"Digite os valores", JOptionPane.OK_CANCEL_OPTION);
  double number1 = Double.parseDouble(number1Frm.getText());
  double number2 = Double.parseDouble(number2Frm.getText());
  double sum = number1 + number2;
  String msg;
  if (sum > 20) {
    sum += 8;
    msg = "maior que 20.";
  } else if (sum < 20) {
    sum -= 5;
    msg = "menor que 20.";
  } else {
    sum -= 5;
    msg = "igual a 20.";
  }
  JOptionPane.showMessageDialog(null, String.format("Número %s\nResultado %.2f", msg, sum));
  }
}
