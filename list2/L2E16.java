import javax.swing.*;
public class L2E16{
  public static void main(String[] args) {
    String dataInput, msg = "";
    double toPay = 0;
    dataInput = JOptionPane.showInputDialog("Digite o código do produto (2,5,6):");
    int productCode = Integer.parseInt(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite quantidade comprada:");
    double quantity = Double.parseDouble(dataInput);
    switch (productCode) {
      case 2: toPay = quantity * 37;
              break;
      case 5: toPay = quantity * 32;
              break;
      case 6: toPay = quantity * 45;
              break;
      default: msg = "Código Invalido";
              break;
    }
    if(msg != null && !msg.isEmpty()){
      JOptionPane.showMessageDialog(null, String.format(msg));
    } else {
      JOptionPane.showMessageDialog(null, String.format("Valor total a ser pago: R$%.2f.", toPay));
    }
  }
}
