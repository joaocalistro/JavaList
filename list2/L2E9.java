import javax.swing.*;
public class L2E9 {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Digite a nota do Laboratório:");
  double labExam = Integer.parseInt(dataInput);
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova Semestral:");
  double semExam = Integer.parseInt(dataInput);
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova final:");
  double finExam = Integer.parseInt(dataInput);
  double weightedAverage = ((2 * labExam) + (3 * semExam) + (5 * finExam)) / (2 + 3 + 5);
  String msg;
  if (weightedAverage >= 7){
    msg = "Aprovado";
  } else {
    msg = "Reprovado";
  }
  JOptionPane.showMessageDialog(null, String.format("Laboratório (peso 2): %.1f\nSemestral (peso 3): %.1f\nFinal (peso 5): %.1f\n\nMédia ponderada: %.1f\n\nConceito: %s", labExam, semExam, finExam, weightedAverage, msg));
  }
}
