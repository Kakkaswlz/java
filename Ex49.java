/******************************************************************************
Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.
*******************************************************************************/
import java.util.Scanner;
public class Ex49
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] soma = new int [10];
	
	 for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número para o primeiro vetor: ");
            vetor1[i] = ler.nextInt();
	}for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número para o segundo vetor: ");
            vetor2[i] = ler.nextInt();
	}for (int i = 0; i < soma.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
	
	}System.out.println("A soma dos dois vetores é de " );
	for (int i = 0; i < soma.length; i++){
	    System.out.println(soma[i]);
	}
}
}