import javax.swing.JOptionPane;
public class Wage {
  public static void main(String[] args) {
    double employeeNumber;
    double hours;
    double hourValue;
    double children;
    double valuePerChildren;
    double wage;
    String dataInput;
    dataInput = JOptionPane.showInputDialog("Digite o número do funcionário:");
    employeeNumber = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite o número de horas trabalhadas:");
    hours = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite a compensação por hora:");
    hourValue = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite a quantia de filhos menores de 14 anos:");
    children = Double.parseDouble(dataInput);
    dataInput = JOptionPane.showInputDialog("Digite o valor do salário família:");
    valuePerChildren = Double.parseDouble(dataInput);
    wage = (hours * hourValue) + (children * valuePerChildren);
    JOptionPane.showMessageDialog(null, String.format("Funcionário número: %.0f\nHoras trabalhadas: %.0f\nCompensação por hora: %.2f\nFilhos menores de 14 anos: %.0f\nSalário família por filho: %.2f\n\nSalário do mês atual: %.2f",employeeNumber, hours, hourValue, children, valuePerChildren, wage));
  }
}

