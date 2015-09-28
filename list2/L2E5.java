import javax.swing.*;
import java.awt.*;
public class L2E5 {
  public static void main(String[] args) {
  JTextField salaryFrm = new JTextField(8);
  JTextField monthPaymentFrm = new JTextField(8);

  JPanel myPanel = new JPanel();
  myPanel.add(new JLabel("Salário:"));
  myPanel.add(salaryFrm);
  myPanel.add(Box.createHorizontalStrut(15));
  myPanel.add(new JLabel("Pagamento mensal:"));
  myPanel.add(monthPaymentFrm);

  int result = JOptionPane.showConfirmDialog(null, myPanel,"Digite os valores", JOptionPane.OK_CANCEL_OPTION);
  double salary = Double.parseDouble(salaryFrm.getText());
  double monthPayment = Double.parseDouble(monthPaymentFrm.getText());
  double maxValue = (salary * 30) / 100;
  if (monthPayment <= maxValue) {
    JOptionPane.showMessageDialog(null, String.format("Empréstimo concedido!"));
  } else {
    JOptionPane.showMessageDialog(null, String.format("Empréstimo NÃO concedido.\n\nValor máximo mensal: R$%.2f", maxValue));
  }
  }
}
