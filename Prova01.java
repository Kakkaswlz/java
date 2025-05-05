/******************************************************************************
1) Crie um programa em Java que leia um número inteiro e diga se ele é par ou ímpar.
*******************************************************************************/
import java.util.Scanner;
public class Prova01
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva um número");
		 int num = ler.nextInt();
	 
	 if (num % 2 == 0){
	     System.out.println("Seu número é par!");
	 }else {
	     System.out.println("Seu número é impar!");
	 }
	}
}
