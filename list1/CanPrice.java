import javax.swing.JOptionPane;
public class CanPrice {
  public static void main(String[] args) {
    double aluminiumPricePerSqMeter;
    double canRadius;
    double canHeight;
    double canArea;
    double canPrice;
    String radiusInput;
    String highInput;
    aluminiumPricePerSqMeter = 100.00;
    radiusInput = JOptionPane.showInputDialog ("Digite o raio da lata em cm: ");
    canRadius = Double.parseDouble(radiusInput);
    highInput = JOptionPane.showInputDialog ("Digite a altura da lata em cm: ");
    canHeight = Double.parseDouble(highInput);

    canArea = (3.14 * ((canRadius*canRadius) * 2)) + (((2 * 3.14) * canRadius) * canHeight);
    canPrice = canArea * (aluminiumPricePerSqMeter / 10000);
    JOptionPane.showMessageDialog(null, String.format("Para a lata de área %.2fcm2 o custo será de R$%.2f", canArea, canPrice));
  }
}
