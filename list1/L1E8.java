import javax.swing.JOptionPane;
public class L1E8 {
  public static void main(String[] args) {
    double seconds;
    double hours;
    double minutes;
    String dataInput;
    dataInput = JOptionPane.showInputDialog ("Digite o tempo em segundos:");
    seconds = Double.parseDouble(dataInput);
    hours = (int)(seconds / 3600);
    seconds = seconds - (hours * 3600);
    minutes = (int)(seconds / 60);
    seconds = seconds - (minutes * 60);
    JOptionPane.showMessageDialog(null, String.format("%.0f Hora(s), %.0f minuto(s) e %.0f segundo(s).", hours, minutes, seconds));
  }
}
