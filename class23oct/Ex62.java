import javax.swing.JOptionPane;
public class Ex62 {
  public static void main(String[] args) {
    int n, x = 1;
    String entrada, saida = "";

    entrada = JOptionPane.showInputDialog("Digite um numero:");
    n = Integer.parseInt(entrada);
    while(n > 0){
    saida = saida + "  " + x;
    x = x + 2;
    n--;
    }
    JOptionPane.showMessageDialog(null, saida);
 }
}