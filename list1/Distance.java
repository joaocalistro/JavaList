import javax.swing.JOptionPane;
public class Distance {
  public static void main(String[] args) {
    double pointA1;
    double pointA2;
    double pointB1;
    double pointB2;
    double distance;
    String pointInput;
    pointInput = JOptionPane.showInputDialog ("Digite a primeira coordenada do ponto A:");
    pointA1 = Double.parseDouble(pointInput);
    pointInput = JOptionPane.showInputDialog ("Digite a segunda coordenada do ponto A:");
    pointA2 = Double.parseDouble(pointInput);
    pointInput = JOptionPane.showInputDialog ("Digite a primeira coordenada do ponto B:");
    pointB1 = Double.parseDouble(pointInput);
    pointInput = JOptionPane.showInputDialog ("Digite a segunda coordenada do ponto B:");
    pointB2 = Double.parseDouble(pointInput);
    distance = Math.sqrt(Math.pow((pointA2 - pointA1), 2) + Math.pow((pointB2 - pointB1), 2));
    JOptionPane.showMessageDialog(null, String.format("A distância entre as coordenadas é de %f.", distance));
  }
}
