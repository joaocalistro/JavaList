import javax.swing.*;
import java.awt.*;
public class L2E8 {
  public static void main(String[] args) {
    JTextField heigthFrm = new JTextField(8);
    JTextField sexFrm = new JTextField(8);

    JPanel myPanel = new JPanel();
    myPanel.add(new JLabel("Altura:"));
    myPanel.add(heigthFrm);
    myPanel.add(Box.createHorizontalStrut(15));
    myPanel.add(new JLabel("Sexo (M ou F):"));
    myPanel.add(sexFrm);

    int result = JOptionPane.showConfirmDialog(null, myPanel,"Digite os dados", JOptionPane.OK_CANCEL_OPTION);
    double heigth = Double.parseDouble(heigthFrm.getText());
    String sex = sexFrm.getText();
    double heightResult;
    String msg;

    if (sex.equals("M") || sex.equals("m")) {
      heightResult = (72.7 * heigth) - 58;
      msg = "Sexo Masculino";
    } else if (sex.equals("F") || sex.equals("f")) {
      heightResult = (62.1 * heigth) - 44.7;
      msg = "Sexo Feminino";
    } else {
      heightResult = 0;
      msg = "Impossível calcular";
    }
      JOptionPane.showMessageDialog(null, String.format("%s\n\nPeso ideal: %.2f Kg", msg, heightResult));
  }
}
