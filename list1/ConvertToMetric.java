import javax.swing.JOptionPane;
public class ConvertToMetric {
  public static void main(String[] args) {
    double fahrenheit;
    double celsius;
    double inches;
    double milimeters;
    String fahrenheitInput;
    String inchesInput;
    fahrenheitInput = JOptionPane.showInputDialog ("Digite a temperatura em Fahrenheit:");
    fahrenheit = Double.parseDouble(fahrenheitInput);
    inchesInput = JOptionPane.showInputDialog ("Digite o volume de chuva em polegadas:");
    inches = Double.parseDouble(inchesInput);
    celsius = ((fahrenheit - 32)*5)/9;
    milimeters = inches * 25.4;
    JOptionPane.showMessageDialog(null, String.format("Para uma temperatura em fahrenheit de %.0f \n o equivalente em Celsius será %.0f. \n\n Para um volume de chuva de %.0f polegadas, \n o equivalente em milimetros será %.0f.", fahrenheit, celsius, inches, milimeters));
  }
}
