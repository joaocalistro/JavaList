import javax.swing.*;
public class L2E21 {
  public static void main(String[] args) {
    String dataInput;
    int oldMan = 0, oldWoman = 0, youngMan = 0, youngWoman = 0;
    int sum = 0, multiply = 0;
    dataInput = JOptionPane.showInputDialog("Idade do primeiro homem:");
    int man1 = Integer.parseInt(dataInput);;
    dataInput = JOptionPane.showInputDialog("Idade do segundo homem:");
    int man2 = Integer.parseInt(dataInput);;
    dataInput = JOptionPane.showInputDialog("Idade da primeira mulher:");
    int woman1 = Integer.parseInt(dataInput);;
    dataInput = JOptionPane.showInputDialog("Idade da segunda mulher:");
    int woman2 = Integer.parseInt(dataInput);;

    if (man1 > man2 && woman1 > woman2) {
      oldMan = man1;
      youngWoman = woman2;
      youngMan = man2;
      oldWoman = woman1;
    }
    if (man1 < man2 && woman1 < woman2) {
      oldMan = man2;
      youngWoman = woman1;
      youngMan = man1;
      oldWoman = woman2;
    }

    if (man1 > man2 && woman1 < woman2) {
      oldMan = man1;
      youngWoman = woman1;
      youngMan = man2;
      oldWoman = woman2;
    }

    if (man1 < man2 && woman1 > woman2) {
      oldMan = man2;
      youngWoman = woman2;
      youngMan = man1;
      oldWoman = woman1;
    }
    sum = oldMan + youngWoman;
    multiply = youngMan * oldWoman;
    JOptionPane.showMessageDialog(null, String.format("A soma é: %d\n\nO produto é: %d", sum, multiply));
  }
}
