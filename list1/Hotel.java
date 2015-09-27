import javax.swing.JOptionPane;
public class Hotel {
  public static void main(String[] args) {
    /*
    Considerações a respeito da minha solução:

    - Para o calculo de ocupação utilizei a regra de arredondamento;
    - Meses considerados com 30 dias 5 semanas (10 para final de semana - sab/dom);
    - Para o item (d), como não tenho os custos, não retornei na string o termo lucro ou prejuizo;
    */

    double regularPrice;
    double regularDaysOccupancy = 40; // percentage
    double promotionDaysOccupancyExpectation = 70; // percentage
    double rooms = 42;
    double promotionDiscount = 22; // percentage
    double promotionPrice;
    double occupancyRegularMonth = Math.round((rooms * regularDaysOccupancy) / 100);
    double occupancyPromotionMonth = Math.round((rooms * promotionDaysOccupancyExpectation) / 100);
    double regularMonthGrossIncome;
    double promotionMonthGrossIncome;
    double incomeDifferenceValue;
    String incomeDifferenceResult;
    String dataInput;

    dataInput = JOptionPane.showInputDialog("Valor da Diária (cheia):");
    regularPrice = Double.parseDouble(dataInput);
    promotionPrice =  (regularPrice * promotionDiscount) /100;
    regularMonthGrossIncome = (occupancyRegularMonth * regularPrice);
    promotionMonthGrossIncome = ((occupancyPromotionMonth - 10) * regularPrice) + (10 * promotionPrice); // weekends sold out
    incomeDifferenceValue = promotionMonthGrossIncome - regularMonthGrossIncome;
    if (incomeDifferenceValue < 0) {
        incomeDifferenceResult = "Valor menor que o normal";
    } else {
        incomeDifferenceResult = "Valor maior que o normal";
    }

    JOptionPane.showMessageDialog(null, String.format("Valor da diária (cheia): R$%.2f\nValor da diária (promoção): R$%.2f\n\nArrecadação no mês SEM promoção: R$%.2f\nArrecadação no mês COM promoção: R$%.2f\nDiferença de valor arrecadado: R$%.2f\n\n%s", regularPrice, promotionPrice, regularMonthGrossIncome, promotionMonthGrossIncome, incomeDifferenceValue, incomeDifferenceResult));
  }
}

