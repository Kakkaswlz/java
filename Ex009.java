/******************************************************************************
Exercicio 009
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
/*******************************************************************************/
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
System.out.println("--------Bem-Vindo a Loja De Tintas----------");
System.out.println("Qual a área em m² que será pintada?");
  int areaPintada = ler.nextInt();
  
 double litrosTinta = areaPintada * 0.33;
 double latasTinta = litrosTinta / 18;
 double valorPago = latasTinta * 80;
  
  
 System.out.println("Serão usados " + Math.round(latasTinta) + " latas para " + litrosTinta + " litros de Tinta");
 System.out.println("O valor total será R$" + valorPago);
	}
}
