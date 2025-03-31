/******************************************************************************
Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. 
*******************************************************************************/
import java.util.Scanner;
public class Ex20
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n, numerosMenores = 0, numerosMedianos = 0, numerosGrandes = 0;
	    for (int i = 1; i <= 20; i++){
	     System.out.println("Insira o " + i + " número: ");
	     n = ler.nextInt();
	     if (n >= 0 && n <= 100){
	         numerosMenores++;
	    }
	    else if (n >= 101 && n <= 200){
	         numerosMedianos++;
	    }
	    else if (n > 200){
	         numerosGrandes++;
	    }
	}
	System.out.println(numerosMenores + " estão entre 0 e 100");
		System.out.println(numerosMedianos + " estão entre 101 e 200");
			System.out.println(numerosGrandes + " são maiores que 200");
}
}
