/******************************************************************************
 Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.
*******************************************************************************/
import java.util.Scanner;
public class Ex07

{
	public static void main(String[] args) {
     double tot, max, com, min;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Insira o valor total do que você vendeu neste mês: ");
     tot = ler.nextDouble();
     com = tot * 0.10;
     max = 1200 + tot + com;
     min = 1200 + tot;
     
     if (tot > 2000)
     System.out.println("Você ganhará uma comissão de " + com + " reais, e receberá no total " + max + " reais");
     else
     System.out.println("Você não ganhará comissão, seu salario será de " + min);
	}
}
