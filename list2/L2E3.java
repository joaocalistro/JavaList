import javax.swing.JOptionPane;
public class L2E3 {
  public static void main(String[] args) {
    String dataInput;
    dataInput = JOptionPane.showInputDialog ("Digite um número:");
    double number = Double.parseDouble(dataInput);
    if ( number > 0 ) {
      JOptionPane.showMessageDialog(null, "Número positivo.");
    } else if (number < 0){
       JOptionPane.showMessageDialog(null, "Número negativo.");
    } else {
      JOptionPane.showMessageDialog(null, "Número nulo.");
    }
  }
}
