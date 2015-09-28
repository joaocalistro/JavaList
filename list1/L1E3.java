import javax.swing.JOptionPane;
public class L1E3 {
  public static void main(String[] args) {
    double factoryPrice;
    double customerPrice;
    int dealerPercentage;
    int tax;
    String priceInput;
    dealerPercentage = 12;
    tax = 30;
    priceInput = JOptionPane.showInputDialog ("Digite o custo de fábrica do veiculo:");
    factoryPrice = Double.parseDouble(priceInput);
    customerPrice = (factoryPrice * tax)/100;
    customerPrice += (((customerPrice+factoryPrice) * dealerPercentage) / 100) + factoryPrice;
    JOptionPane.showMessageDialog(null, String.format("O valor do veiculo para venda ao consumidor será de R$%.2f.", customerPrice));
  }
}
