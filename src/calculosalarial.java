
import java.util.Scanner;

public class calculosalarial {
    public static void main(String[] args) {
      //Lê os valores de Entrada:
      Scanner leitorDeEntradas=new Scanner (System.in);
      float valorSalario=leitorDeEntradas.nextFloat();
      float valorBeneficios= leitorDeEntradas.nextFloat();

      float valorImposto=0;
      if (valorSalario>=0 && valorSalario<=1100){
        //Atribui e aliquota de 5% mediante o salário:
        valorImposto=0.05f*valorSalario;
      }
      else if (valorSalario >=1100.01 && valorSalario<=2500.00){
        valorImposto=0.10f* valorSalario;
      }
      else{
       
        valorImposto=0.15f* valorSalario;
      }
      //TODO Criar as demais condições para as aliquotas de 10.00% e 15.0%

      float saida=valorSalario-valorImposto+valorBeneficios;
      System.out.println(String.format("%.2f", saida));
      }

}
