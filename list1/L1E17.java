import javax.swing.*;
public class L1E17 {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova 1:");
  double exam1 = Integer.parseInt(dataInput);
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova 2:");
  double exam2 = Integer.parseInt(dataInput);
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova 3:");
  double exam3 = Integer.parseInt(dataInput);
  double weightedAverage = ((2 * exam1) + (3 * exam2) + (5 * exam3)) / (2 + 3 + 5);
  JOptionPane.showMessageDialog(null, String.format("Nota 1 (peso 2): %.1f\nNota 2 (peso 3): %.1f\nNota 3 (peso 5): %.1f\n\nMédia ponderada: %.1f\n", exam1, exam2, exam3, weightedAverage));
  }
}
