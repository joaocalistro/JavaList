import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class L2E26 {
  public static void main(String[] args){
    String todayDate = JOptionPane.showInputDialog("Digite a data atual no formato dd/mm/yyyy.");
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date date = df.parse(todayDate);
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(date);
      int mes = calendar.get(Calendar.MONTH);
      int dia = calendar.get(Calendar.DAY_OF_MONTH);
      String season = "";
      if ((dia >= 21 && mes == 8) || (mes > 8 && mes < 11) || (dia <= 20 && mes == 11)){
        season = "Primavera";
      } else if ((dia >= 21 && mes == 11) || (mes < 2) || (dia <= 20 && mes == 2)){
        season = "Verão";
      } else if ((dia >= 21 && mes == 2) || (mes > 2 && mes < 5) || (dia <= 20 && mes == 5)){
        season = "Outono";
      } else if ((dia >= 21 && mes == 5) || (mes > 5 && mes < 11) || (dia <= 20 && mes == 8)){
        season = "Inverno";
      } else {
        season = "Não encontrada";
      }
      JOptionPane.showMessageDialog(null, String.format("Estação: %s", season));
    } catch (ParseException ex) {
          System.out.println("Erro ao converter data:" + ex.getMessage());
    }
  }
}