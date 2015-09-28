import javax.swing.*;
public class L2E10 {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Digite o nome do(a) aluno(a):");
  String name = dataInput;
  dataInput = JOptionPane.showInputDialog("Digite a média desse(a) aluno(a):");
  double average = Double.parseDouble(dataInput);
  String msg;
  if (average >= 9) {
    msg = "Altamente recomendado!";
  } else if (average >= 8 && average < 9) {
    msg = "Fortemente recomendado!";
  } else if (average >= 7 && average < 8) {
    msg = "Recomendado.";
  } else {
    msg = "Não recomendado.";
  }
  JOptionPane.showMessageDialog(null, String.format("O aluno(a) %s tem a recomendação:\n\n%s", name, msg));
  }
}
