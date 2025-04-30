/******************************************************************************
Exercicio 014
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa 
que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
*******************************************************************************/
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double aumento, salarioFinal;
    
System.out.println("Insira seu salário para calcularmos o reajuste");
  int salarioInicial = ler.nextInt();
  
  
   if (salarioInicial <= 280){
       aumento = salarioInicial * 0.2;
       salarioFinal = salarioInicial + aumento;
      
     System.out.println("Seu salário era R$" + salarioInicial);
     System.out.println("Você receberá um aumento de 20%");
     System.out.println("Será adicionado em seu salário R$" + aumento);
     System.out.println("Seu novo salário após o aumento será R$" + salarioFinal);
   }else if (salarioInicial > 280 && salarioInicial < 700){
       aumento = salarioInicial * 0.15;
       salarioFinal = salarioInicial + aumento;
      
     System.out.println("Seu salário era R$" + salarioInicial);
     System.out.println("Você receberá um aumento de 15%");
     System.out.println("Será adicionado em seu salário R$" + aumento);
     System.out.println("Seu novo salário após o aumento será R$" + salarioFinal);
   }else if (salarioInicial > 700 && salarioInicial < 1500){
       aumento = salarioInicial * 0.1;
       salarioFinal = salarioInicial + aumento;
      
     System.out.println("Seu salário era R$" + salarioInicial);
     System.out.println("Você receberá um aumento de 10%");
     System.out.println("Será adicionado em seu salário R$" + aumento);
     System.out.println("Seu novo salário após o aumento será R$" + salarioFinal);
   }else if (salarioInicial >= 1500){
       aumento = salarioInicial * 0.05;
       salarioFinal = salarioInicial + aumento;
      
     System.out.println("Seu salário era R$" + salarioInicial);
     System.out.println("Você receberá um aumento de 5%");
     System.out.println("Será adicionado em seu salário R$" + aumento);
     System.out.println("Seu novo salário após o aumento será R$" + salarioFinal);
   }
	}
}
