/******************************************************************************
Exercicio 002
Faça um Programa que peça dois números e imprima a soma.
*******************************************************************************/
import java.util.Scanner;
public class Ex002
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
	System.out.print("Insira um número: ");
	  int numeroUm = ler.nextInt();
	  
	System.out.print("Insira um segundo número: ");
	  int numeroDois = ler.nextInt();
	  
	double soma = numeroUm + numeroDois;
	
	 System.out.println("A soma de seus números é " + soma);
	}
}
