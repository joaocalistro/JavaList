import javax.swing.*;
import java.awt.*;
public class Exam {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova 1:");
  double exam1 = Integer.parseInt(dataInput);
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova 2:");
  double exam2 = Integer.parseInt(dataInput);
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova 3:");
  double exam3 = Integer.parseInt(dataInput);
  dataInput = JOptionPane.showInputDialog("Digite a nota da prova 4:");
  double exam4 = Integer.parseInt(dataInput);

  double arithmetic = (exam1 + exam2 + exam3 + exam4) / 4;
  double harmonic = 4 / (1 / exam1 + 1 / exam2 + 1 / exam3 + 1 / exam4);
  double geometric = (float) Math.exp((Math.log(exam1 * exam2 * exam3 * exam4))/4);
  double quadratic = Math.sqrt((Math.pow(exam1, 2) + Math.pow(exam2, 2) + Math.pow(exam3, 2) + Math.pow(exam4, 2)) / 4);
  JOptionPane.showMessageDialog(null, String.format("Nota 1: %.1f\nNota 2: %.1f\nNota 3: %.1f\nNota 4: %.1f\n\nMédia aritmética: %.1f\nMédia harmônica: %.1f\nMédia geométrica: %.1f\nMédia quadrática: %.1f\n", exam1, exam2, exam3, exam4, arithmetic, harmonic, geometric, quadratic));
  }
}
