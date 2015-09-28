import javax.swing.*;
public class L1E14 {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Taxa de potência do refrigerador em watts:");
  double refrigeratorPower = Double.parseDouble(dataInput);
  dataInput = JOptionPane.showInputDialog("Tempo ligado em horas:");
  double timeWorking = Double.parseDouble(dataInput);
  dataInput = JOptionPane.showInputDialog("Valor do quilowatt/hora:");
  double kilowattHourValue = Double.parseDouble(dataInput);
  double energyExpended = refrigeratorPower * timeWorking;
  double priceToPay = refrigeratorPower * kilowattHourValue;
  JOptionPane.showMessageDialog(null, String.format("Energia total gasta: %.0f\n\nValor a ser pago: R$%.2f", energyExpended, priceToPay));
  }
}