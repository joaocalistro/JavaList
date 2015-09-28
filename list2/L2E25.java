import javax.swing.JOptionPane;

public class L2E25 {
  public static void main(String[] args){
    int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta bancaria."));
    double balance = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta:"));
    int type = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação - 1 deposito 2 retirada."));

    if (type == 1 || type == 2){
      double value = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da operacao."));
      if(type == 1){
        balance += value;
      } else if(type == 2){
        balance -= value;
      }
      if (balance >= 0){
        JOptionPane.showMessageDialog(null, String.format("C/C %d\n\nNovo saldo: R$%.2f", accountNumber, balance));
      } else {
        JOptionPane.showMessageDialog(null, String.format("C/C %d\n\nConta estourada.\nNovo saldo: R$%.2f", accountNumber, balance));
      }
    } else {
      JOptionPane.showMessageDialog(null, String.format("Operacao inavlida."));
    }
  }
}
