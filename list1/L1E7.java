import javax.swing.JOptionPane;
public class L1E7 {
  public static void main(String[] args) {
    int years;
    int months;
    int days;
    int ageInDays;
    String dataInput;
    dataInput = JOptionPane.showInputDialog ("Digite sua idade em anos:");
    years = Integer.parseInt(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite quantos meses se passaram após seu aniversário:");
    months = Integer.parseInt(dataInput);
    dataInput = JOptionPane.showInputDialog ("Digite quantos dias se passaram após o dia em que faz aniversário:");
    days = Integer.parseInt(dataInput);
    ageInDays = (years * 365) + (months * 30) + days;
    JOptionPane.showMessageDialog(null, String.format("Sua idade em dias é de %d.", ageInDays));
  }
}
