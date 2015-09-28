import javax.swing.JOptionPane;
public class L2E24 {
  public static void main(String[] args){
    double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda do produto."));
    int payment = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da condição de pagamento(0 a 3)."));
    Double discountPrice;
    switch(payment){
      case 0: discountPrice = productPrice - (productPrice * 0.25);
              break;
      case 1: discountPrice = productPrice - (productPrice * 0.20);
              break;
      case 2: discountPrice = productPrice - (productPrice * 0.10);
              break;
      case 3: discountPrice = productPrice - (productPrice * 0.05);
              break;
      default: discountPrice = productPrice;
              break;
    }
    JOptionPane.showMessageDialog(null, String.format("Preco com desconto: R$%.2f\n\nPreco de venda: R$%.2f.", discountPrice, productPrice));
  }
}
