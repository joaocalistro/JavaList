import javax.swing.*;
public class L2E11 {
  public static void main(String[] args) {
  String dataInput;
  dataInput = JOptionPane.showInputDialog("Digite o primeiro número:");
  double numberX = Double.parseDouble(dataInput);;
  dataInput = JOptionPane.showInputDialog("Digite o segundo número:");
  double numberY = Double.parseDouble(dataInput);
  dataInput = JOptionPane.showInputDialog("Digite o terceiro número:");
  double numberZ = Double.parseDouble(dataInput);
  double largest = 0;
  double smallest = 0;

  if (numberX > numberY && numberX > numberZ){
    largest = numberX;
  } else if (numberY > numberX && numberY > numberZ){
    largest = numberY;
  } else if (numberZ > numberX && numberZ > numberY){
    largest = numberZ;
  }

  if (numberX < numberY && numberX < numberZ){
    smallest = numberX;
  } else if (numberY < numberX && numberY < numberZ){
    smallest = numberY;
  } else if (numberZ < numberX && numberZ < numberY){
    smallest = numberZ;
  }

  JOptionPane.showMessageDialog(null, String.format("Entre os números %.2f, %.2f e %.2f\n\nO maior é o %.2f\nO menor é o %.2f", numberX, numberY, numberZ, largest, smallest));
  }
}
