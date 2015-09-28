import javax.swing.*;
public class L1E15 {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Digite o número da conta (3 digitos):");
  int accountNumber = Integer.parseInt(dataInput);
  int accountNumberToWork = accountNumber;
  int reverseAccNumber = 0;
  while(accountNumberToWork != 0) {
    reverseAccNumber = reverseAccNumber * 10;
    reverseAccNumber = reverseAccNumber + accountNumberToWork % 10;
    accountNumberToWork = accountNumberToWork / 10;
  }
  int accPlusReverse = accountNumber + reverseAccNumber;
  int first = (accPlusReverse / 100);
  int second = ((accPlusReverse - (first * 100)) / 10);
  int third = (accPlusReverse - ((first * 100) + (second * 10)));
  first = first * 1;
  second = second * 2;
  third = third * 3;
  int checkSum = (first + second + third) % 10;
  JOptionPane.showMessageDialog(null, String.format("Conta com digito verificador: %d-%d", accountNumber, checkSum));
  }
}
