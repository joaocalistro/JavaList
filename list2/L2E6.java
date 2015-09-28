import javax.swing.*;
import java.awt.*;
public class L2E6 {
  public static void main(String[] args) {
    JTextField valueFrm = new JTextField(8);
    JTextField customerCodeFrm = new JTextField(8);

    JPanel myPanel = new JPanel();
    myPanel.add(new JLabel("Valor:"));
    myPanel.add(valueFrm);
    myPanel.add(Box.createHorizontalStrut(15));
    myPanel.add(new JLabel("Código do cliente (C, F, E):"));
    myPanel.add(customerCodeFrm);

    int result = JOptionPane.showConfirmDialog(null, myPanel,"Digite os dados da compra", JOptionPane.OK_CANCEL_OPTION);
    double value = Double.parseDouble(valueFrm.getText());
    String customerCode = customerCodeFrm.getText();

    int discount;
    if (customerCode.equals("E") || customerCode.equals("e")){
      discount = 10;
      JOptionPane.showMessageDialog(null, String.format("Cliente especial!\n\nValor: R$%.2f\nDesconto %d%%\nValor a pagar: R$%.2f", value, discount, (value - (value * discount)/100)));
    } else if (customerCode.equals("F") || customerCode.equals("f")){
      discount = 5;
      JOptionPane.showMessageDialog(null, String.format("Funcionário!\n\nValor: R$%.2f\nDesconto %d%%\nValor a pagar: R$%.2f", value, discount, (value - (value * discount)/100)));
    } else {
      JOptionPane.showMessageDialog(null, String.format("Cliente.\n\nValor a pagar: R$%.2f", value));
    }
  }
}
