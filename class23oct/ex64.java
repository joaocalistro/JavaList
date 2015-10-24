import javax.swing.JOptionPane;
public class Ex64 {
  public static void main(String[] args) {
    int n, m = 0, r;
    String dataInput, output;

    dataInput = JOptionPane.showInputDialog("Digite um número inteiro sem conter 0 (ZERO) no início nem no final:");
    n = Integer.parseInt(dataInput);
    while(n > 0){
      r = n % 10;
      m = m * 10 + r;
      n = n / 10;
    }
    output = "O número invertido é: " + m;
    JOptionPane.showMessageDialog(null, output);
  }
}
