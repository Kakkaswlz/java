/******************************************************************************
Exercicio 003
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
*******************************************************************************/
import java.util.Scanner;
public class Ex003
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	System.out.println("Insira sua 1° nota ");
	 int notaUm = ler.nextInt();
    System.out.println("Insira sua 2° nota ");
	 int notaDois = ler.nextInt();
    System.out.println("Insira sua 3° nota ");
	 int notaTres = ler.nextInt();
	System.out.println("Insira sua 4° nota ");
	 int notaQuatro = ler.nextInt();
	 
	 
	double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
	
	System.out.println("Sua média do período letivo é de " + media );
	
	}
}
