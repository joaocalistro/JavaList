import javax.swing.*;
public class L2E12 {
  public static void main(String[] args) {
    String dataInput, err = "n";
    double numberX = 0, numberY = 0;
    dataInput = JOptionPane.showInputDialog("Digite o primeiro número:");
    if(dataInput.matches(".*\\d.*")){
      numberX = Double.parseDouble(dataInput);;
    } else {
      JOptionPane.showMessageDialog(null, String.format("Opção inválida"));
      err = "y";
    }
    dataInput = JOptionPane.showInputDialog("Digite o segundo número:");
    if(dataInput.matches(".*\\d.*")){
      numberY = Double.parseDouble(dataInput);
    } else {
      JOptionPane.showMessageDialog(null, String.format("Opção inválida"));
      err = "y";
    }
    if (err != "y"){
      double divide = numberX / numberY;
      int quotient = (int)divide;
      JOptionPane.showMessageDialog(null, String.format("Dados os números %.2f e %.2f\n\nO quociente da divisão é: %d\nA multiplicação dos números resulta %.2f\nA soma dos números resulta %.2f\nA subtração de um pelo outro resulta %.2f", numberX, numberY, quotient, numberX * numberY, numberX + numberY, numberX - numberY));
    } else {
      JOptionPane.showMessageDialog(null, String.format("Opção inválida na hora de digitar os números, comece novamente."));
    }
  }
}
