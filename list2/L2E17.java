import javax.swing.*;
public class L2E17{
  public static void main(String[] args) {
    String dataInput, msg = "";
    double newSalary = 0;
    dataInput = JOptionPane.showInputDialog("Digite o código do cargo (101,102,103):");
    int positionCode = Integer.parseInt(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite o salário atual:");
    double actualSalary = Double.parseDouble(dataInput);
    switch (positionCode) {
      case 101: newSalary = ((actualSalary * 10) / 100) + actualSalary;
              msg = "Gerente";
              break;
      case 102: newSalary = ((actualSalary * 20) / 100) + actualSalary;
              msg = "Engenheiro";
              break;
      case 103: newSalary = ((actualSalary * 30) / 100) + actualSalary;
              msg = "Técnico";
              break;
      default: newSalary = ((actualSalary * 40) / 100) + actualSalary;
              msg = "Cargo desconhecido.";
              break;
    }
    JOptionPane.showMessageDialog(null, String.format("Cargo: %s\n\nSalário atual: R$%.2f\n\nNovo salário: R$%.2f", msg, actualSalary, newSalary));
  }
}
