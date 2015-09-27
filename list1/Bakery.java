import javax.swing.*;
import java.awt.*;
public class Bakery {
  public static void main(String[] args) {

  /*
  Considerações a respeito da minha solução:

  - Mesmo não constando o fermento na segunda parte do enunciado, inclui o mesmo;
  */
  JTextField flourQuantityFrm = new JTextField(8);
  JTextField flourValueKilogramFrm = new JTextField(8);
  JTextField waterQuantityFrm = new JTextField(8);
  JTextField waterValueLiterFrm = new JTextField(8);
  JTextField yeastQuantityFrm = new JTextField(8);
  JTextField yeastValueKilogramFrm = new JTextField(8);
  JTextField energyQuantityFrm = new JTextField(8);
  JTextField energyValueKilowattsFrm = new JTextField(8);


  JPanel myPanel = new JPanel();
  myPanel.add(new JLabel("Qtd. farinha:"));
  myPanel.add(flourQuantityFrm);
  myPanel.add(Box.createHorizontalStrut(15)); // a spacer
  myPanel.add(new JLabel("Valor do quilo:"));
  myPanel.add(flourValueKilogramFrm);

  JPanel myPanel2 = new JPanel();
  myPanel2.add(new JLabel("Qtd. água:"));
  myPanel2.add(waterQuantityFrm);
  myPanel2.add(Box.createHorizontalStrut(15)); // a spacer
  myPanel2.add(new JLabel("Valor do litro:"));
  myPanel2.add(waterValueLiterFrm);

  JPanel myPanel3 = new JPanel();
  myPanel3.add(new JLabel("Qtd. fermento:"));
  myPanel3.add(yeastQuantityFrm);
  myPanel3.add(Box.createHorizontalStrut(15)); // a spacer
  myPanel3.add(new JLabel("Valor do quilo:"));
  myPanel3.add(yeastValueKilogramFrm);

  JPanel myPanel4 = new JPanel();
  myPanel4.add(new JLabel("Qtd. energia:"));
  myPanel4.add(energyQuantityFrm);
  myPanel4.add(Box.createHorizontalStrut(15)); // a spacer
  myPanel4.add(new JLabel("Valor do quilowatt:"));
  myPanel4.add(energyValueKilowattsFrm);

  int result = JOptionPane.showConfirmDialog(null, myPanel,"Digite os valores", JOptionPane.OK_CANCEL_OPTION);
  double flourQuantity = Double.parseDouble(flourQuantityFrm.getText()); // kilogram
  double flourValueKilogram = Double.parseDouble(flourValueKilogramFrm.getText());

  result = JOptionPane.showConfirmDialog(null, myPanel2,"Digite os valores", JOptionPane.OK_CANCEL_OPTION);
  double waterQuantity = Double.parseDouble(waterQuantityFrm.getText()); //liter
  double waterValueLiter = Double.parseDouble(waterValueLiterFrm.getText());

  result = JOptionPane.showConfirmDialog(null, myPanel3,"Digite os valores", JOptionPane.OK_CANCEL_OPTION);
  double yeastQuantity = Double.parseDouble(yeastQuantityFrm.getText()); //kilogram
  double yeastValueKilogram = Double.parseDouble(yeastValueKilogramFrm.getText());

  result = JOptionPane.showConfirmDialog(null, myPanel4,"Digite os valores", JOptionPane.OK_CANCEL_OPTION);
  double energyQuantity = Double.parseDouble(energyQuantityFrm.getText()); //kilogram
  double energyValueKilowatts = Double.parseDouble(energyValueKilowattsFrm.getText());

  String dataInput;
  dataInput = JOptionPane.showInputDialog("Valor o imposto:");
  double tax = Double.parseDouble(dataInput);
  double productionPrice;
  double totalKilograms = (flourQuantity + waterQuantity + yeastQuantity);
  productionPrice = (((flourQuantity * flourValueKilogram) + (waterQuantity * waterValueLiter) + (yeastQuantity * yeastValueKilogram) + (energyQuantity * energyValueKilowatts) * tax) / totalKilograms);
  double customerPrice = ((productionPrice * 130) / 100);

  JOptionPane.showMessageDialog(null, String.format("Preço de custo do kilo do pão francês: R$%.2f\n\nPreço de venda ao consumidor: R$%.2f", productionPrice, customerPrice));
  }
}

