import javax.swing.*;
public class L2E15{
  public static void main(String[] args) {
    String dataInput, msg = "";
    double credit = 0;
    dataInput = JOptionPane.showInputDialog("Digite o saldo médio:");
    double averageBalance = Double.parseDouble(dataInput);
    if (averageBalance <= 200){
      msg = "Sem crédito disponível";
    } else if (averageBalance >= 201 && averageBalance <= 400){
      credit = (averageBalance * 20) / 100;
    } else if (averageBalance >= 401 && averageBalance <= 600){
      credit = (averageBalance * 30) / 100;
    } else if (averageBalance >= 601){
      credit = (averageBalance * 40) / 100;
    }
    if(msg != null && !msg.isEmpty()){
      JOptionPane.showMessageDialog(null, String.format("O saldo médio do último ano foi R$%.2f.\n\n%s", averageBalance, msg));
    } else {
      JOptionPane.showMessageDialog(null, String.format("O saldo médio do último ano foi R$%.2f.\n\nCrédito disponível de R$%.2f", averageBalance, credit));
    }
  }
}
