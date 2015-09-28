import javax.swing.JOptionPane;
public class L2E23 {
  public static void main(String[] args){
    double q1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a carga eletrica Q1 de uma particula."));
    double q2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a carga eletrica Q2 de outra particula."));
    double distance = Double.parseDouble(JOptionPane.showInputDialog("Digite a distancia entre as particulas."));

    if(distance > 0){
      double k = 9 * Math.pow(10, 9);
      double f = (k * q1 * q2) / (distance * distance);
      JOptionPane.showMessageDialog(null, String.format("O valor da força elétrica entre as particulas é: %f.", f));
    } else {
      JOptionPane.showMessageDialog(null, "Valor incorreto de distância.");
    }
  }
}
