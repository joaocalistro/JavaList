import javax.swing.*;
public class L2E20 {
  public static void main(String[] args) {
    String dataInput;
    double toPay = 0;
    dataInput = JOptionPane.showInputDialog("Quantas maças foram compradas?");
    int apple = Integer.parseInt(dataInput);;
    if (apple >= 12){
      toPay = apple * 1;
    } else {
      toPay = apple * 1.3;
    }
    JOptionPane.showMessageDialog(null, String.format("Total da compra: R$%.2f", toPay));
  }
}
