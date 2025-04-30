/******************************************************************************
Exercicio 001
Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
*******************************************************************************/
import java.util.Scanner;
public class Ex001
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	
	System.out.print("Insura um número: ");
    	int numero = ler.nextInt();
	
	System.out.println(" o número informado foi " + numero );
	}
}
