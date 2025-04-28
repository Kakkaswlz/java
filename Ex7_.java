/******************************************************************************
7.
Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também
informado pelo usuário, utilizando laços de repetição. Dica: Inicie a variável resultado com o valor 1.

Ex:
Base: 2
Expoente:7 
Resultado:128

Base: 5
Expoente:3 
Resultado:125

*******************************************************************************/
import java.util.Scanner;
public class Ex7_ {
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int resultado = 1;
	    int contador = 0;
	    
	    
		System.out.println("Digite a base: ");
		int base = ler.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = ler.nextInt();
		
		while (contador < expoente) {
		    resultado *= base;
		   
		   contador++;
		}
		
		System.out.println("Base: "+ base);
		System.out.println("Expoente: "+ expoente);
		System.out.println("Resultado: " + resultado);
	}
}