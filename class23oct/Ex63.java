import javax.swing.JOptionPane;
public class Ex63 {
  public static void main(String[] args) {
    int idade = -1, maioridade = 0, femHab = 0;
    double totalHab = 0, porcentagem = 0;
    char sexo;
    String dataInput;

    dataInput = JOptionPane.showInputDialog("Entre com a idade do habitante ou -1 para encerrar:");
    idade = Integer.parseInt(dataInput);
    while(idade != -1){
      dataInput = JOptionPane.showInputDialog("Entre com o sexo do habitante (M ou F):");
      sexo = dataInput.charAt(0);
      if(idade > maioridade){
        maioridade = idade;
      }
      totalHab++;
      if((idade >= 18) && (idade >= 35) && (sexo == 'f')){
        femHab++;
      }
      dataInput = JOptionPane.showInputDialog("Entre com a idade do habitante ou -1 para encerrar:");
      idade = Integer.parseInt(dataInput);
    }
    if(totalHab > 0){
      porcentagem = (femHab * 100) / totalHab;
      String output = "A maior idade é: " + maioridade + "\n\nA porcentagem é: " + porcentagem;
      JOptionPane.showMessageDialog(null, output);
    }
  }
}
