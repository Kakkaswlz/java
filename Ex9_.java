/******************************************************************************
9.
Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores que 10.

*******************************************************************************/
import java.util.Scanner;
public class Ex9_ {
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    
	    int maiorQueDez = 0;
	    
	    for(int i = 1; i <= 20; i++) {
	        System.out.println("Digite o " + i + " número");
	        int n = ler.nextInt();
	        if (n > 10) {
	            maiorQueDez++;
	        }
	    }
	    System.out.println("\nQuantidade de números maiores que 10: " + maiorQueDez);
	}
}