/******************************************************************************
Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
*******************************************************************************/
import java.util.Scanner;
public class Ex16
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    String nome;
	    
	    System.out.println("Insira seu nome: ");
	    nome = ler.nextLine();
	    
	    for(int i = 0; i <= 10; i++)
	      System.out.println("Olá " + nome);
	}
} 
