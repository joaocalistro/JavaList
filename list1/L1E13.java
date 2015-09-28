import javax.swing.*;
public class L1E13 {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Público pagante:");
  double audience = Double.parseDouble(dataInput);
  double popular = ((audience * 10) / 100);
  double popularIncome = (popular * 1);
  double general = ((audience * 50) / 100);
  double generalIncome = (general * 5);
  double bleachers = ((audience * 30) / 100);
  double bleachersIncome = (bleachers * 10);
  double chairs = ((audience * 10) / 100);
  double chairsIncome = (chairs * 20);
  double income = popularIncome + generalIncome + bleachersIncome + chairsIncome;
  JOptionPane.showMessageDialog(null, String.format("Renda do Jogo:\n\nPopular %.0f - R$%.2f\nGeral %.0f - R$%.2f\nArquibancada %.0f - R$%.2f\nCadeiras %.0f - R$%.2f\n\nRenda do jogo: R$%.2f", popular, popularIncome, general, generalIncome, bleachers, bleachersIncome, chairs, chairsIncome, income));
  }
}

