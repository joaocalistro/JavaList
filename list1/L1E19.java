import javax.swing.*;
import java.awt.*;
public class L1E19 {
  public static void main(String[] args) {
  JTextField lcdFrm = new JTextField(5);
  JTextField ledFrm = new JTextField(5);
  JTextField plasmaFrm = new JTextField(5);
  JPanel myPanel = new JPanel();
  myPanel.add(new JLabel("TV LCD:"));
  myPanel.add(lcdFrm);
  myPanel.add(Box.createHorizontalStrut(15));
  myPanel.add(new JLabel("TV LED:"));
  myPanel.add(ledFrm);
  myPanel.add(Box.createHorizontalStrut(15));
  myPanel.add(new JLabel("TV Plasma:"));
  myPanel.add(plasmaFrm);
  int result = JOptionPane.showConfirmDialog(null, myPanel,"Digite a quantidade vendida", JOptionPane.OK_CANCEL_OPTION);
  int lcd = Integer.parseInt(lcdFrm.getText());
  int led = Integer.parseInt(ledFrm.getText());
  int plasma = Integer.parseInt(plasmaFrm.getText());
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Digite o valor do salário fixo:");
  double salary = Double.parseDouble(dataInput);
  double commissions = (lcd * 50) + (led * 60) + (plasma * 55);
  double toPay = salary + commissions;
  JOptionPane.showMessageDialog(null, String.format("Salário: R$%.2f\nComissões: R$%.2f\n\nTotal a pagar (salário + comissões): %.2f", salary, commissions, toPay));
  }
}
