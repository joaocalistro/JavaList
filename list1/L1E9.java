import javax.swing.JOptionPane;
public class L1E9 {
  public static void main(String[] args) {
    double ipi;
    double product1;
    double value1;
    double quantity1;
    double product2;
    double value2;
    double quantity2;
    double result;
    String dataInput;
    dataInput = JOptionPane.showInputDialog ("Digite a porcentagem do IPI:");
    ipi = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite o código do produto 1:");
    product1 = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite a quantidade do produto 1:");
    quantity1 = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite o valor do produto 1:");
    value1 = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite o código do produto 2:");
    product2 = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite a quantidade do produto 2:");
    quantity2 = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite o valor do produto 2:");
    value2 = Double.parseDouble(dataInput);
    result = (quantity1 * value1) + (quantity2 * value2) * ((ipi / 100) + 1);
    JOptionPane.showMessageDialog(null, String.format("Produto 1:\nCódigo: %.0f\nQuantidade: %.0f\nValor: R$%.2f\n\nProduto 2:\nCódigo: %.0f\nQuantidade: %.0f\nValor: R$%.2f\n\nIPI: %.2f%%\n\nValor total a ser pago: R$%.2f", product1, quantity1, value1, product2, quantity2, value2, ipi, result));
  }
}
