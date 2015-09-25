import javax.swing.JOptionPane;
public class Pyramid {
  public static void main(String[] args) {
    double base;
    double height;
    double volume;
    String dataInput;
    dataInput = JOptionPane.showInputDialog ("Digite o tamanho da base da pirâmide:");
    base = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite a altura da pirâmide:");
    height = Double.parseDouble(dataInput);
    volume = (height * base) / 3;
    JOptionPane.showMessageDialog(null, String.format("O volume da pirâmide é de %f.", volume));
  }
}
