import javax.swing.*;
public class L2E18{
  public static void main(String[] args) {
    String dataInput;
    int duration = 0;
    dataInput = JOptionPane.showInputDialog("Digite a hora de inicio do jogo(1-24):");
    int started = Integer.parseInt(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite a hora do final do jogo(1-24):");
    int finished = Integer.parseInt(dataInput);

    if (finished < started){
      duration = (24 - started) + finished;
    } else {
      duration = finished - started;
    }
    JOptionPane.showMessageDialog(null, String.format("Tempo total do jogo: %d horas", duration));
  }
}
