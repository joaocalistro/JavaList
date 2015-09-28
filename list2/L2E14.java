import javax.swing.*;
public class L2E14{
  public static void main(String[] args) {
    String dataInput;
    dataInput = JOptionPane.showInputDialog("Digite o número do fazendeiro:");
    int farmerNumber = Integer.parseInt(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite o tipo de pulverização (1 a 4):");
    int typeChoosed = Integer.parseInt(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite o tamanho da área em acre:");
    double powderedArea = Double.parseDouble(dataInput);
    double toPay = 0, toCalc = 0;
    String msg = "";
    switch (typeChoosed) {
      case 1: toPay = powderedArea * 5;
              break;
      case 2: toPay = powderedArea * 10;
              break;
      case 3: toPay = powderedArea * 15;
              break;
      case 4: toPay = powderedArea * 25;
              break;
      default: msg = "Tipo Invalido";
              break;
    }
    if(msg != null && !msg.isEmpty()){
      JOptionPane.showMessageDialog(null, String.format(msg));
    } else {
      if (powderedArea > 300){
        toPay = (toPay - ((toPay * 5) / 100));
      }
      if (toPay > 1750){
        toCalc = toPay - 1750;
        toCalc = (toCalc - ((toCalc * 10) / 100));
        toPay = toCalc + 1750;
      }
      JOptionPane.showMessageDialog(null, String.format("O fazendeiro, %d, pagará pelo serviço de pulverização: R$%.2f.", farmerNumber, toPay));
    }
  }
}
