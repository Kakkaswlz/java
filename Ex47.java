/******************************************************************************
Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.
*******************************************************************************/
import java.util.Scanner;
public class Ex47
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] valores = new int[20];
		
		
	for(int i=0; i < valores.length; i++){
	    System.out.println("Insira o " + (i + 1) + " número inteiro ");
	     valores[i] = ler.nextInt();
	}System.out.println("Os números na ordem inversa são: ");
	for (int i = valores.length - 1; i >= 0; i--){
	    System.out.println(valores[i] + " ");
	}
	
	
	}
}
