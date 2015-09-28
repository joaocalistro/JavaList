import javax.swing.*;
import java.awt.*;
public class L1E20 {
  public static void main(String[] args) {
  JTextField timeExpendedFrm = new JTextField(5);
  JTextField averageVelocityFrm = new JTextField(5);
  JPanel myPanel = new JPanel();
  myPanel.add(new JLabel("Tempo:"));
  myPanel.add(timeExpendedFrm);
  myPanel.add(Box.createHorizontalStrut(15));
  myPanel.add(new JLabel("Velocidade média:"));
  myPanel.add(averageVelocityFrm);
  double result = JOptionPane.showConfirmDialog(null, myPanel,"Digite os dados da viagem", JOptionPane.OK_CANCEL_OPTION);
  double timeExpended = Double.parseDouble(timeExpendedFrm.getText());
  double averageVelocity = Double.parseDouble(averageVelocityFrm.getText());
  double distance = timeExpended * averageVelocity;
  double consumption = distance / 12;
  double moneyNeeded = consumption * 2.90;
  JOptionPane.showMessageDialog(null, String.format("Distância: %.2f KM\nCombustível a ser utilizado: %.2f Lts\n\nPrevisão de gasto: R$%.2f", distance, consumption, moneyNeeded));
  }
}
