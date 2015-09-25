import javax.swing.JOptionPane;
public class Cart {
  public static void main(String[] args) {
    double promotedPrice;
    double hourPrice;
    double timeExpended;
    double toPay;
    String priceType;
    String dataInput;
    promotedPrice = 8.50;
    hourPrice = 3.50;
    dataInput = JOptionPane.showInputDialog ("Digite o tempo utilizado pelo cliente:");
    timeExpended = Double.parseDouble(dataInput);
    timeExpended = Math.round(timeExpended);

    if (timeExpended >= 3) {
        toPay = timeExpended * promotedPrice;
        priceType = "Promoção + de 3 horas.";
    } else {
        toPay = timeExpended * hourPrice;
        priceType = "Valor normal por hora.";
    }

    JOptionPane.showMessageDialog(null, String.format("O valor total a ser pago é de R$%.2f.\n\n%s", toPay, priceType));
  }
}
