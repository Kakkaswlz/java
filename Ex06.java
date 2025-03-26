/******************************************************************************
Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.
*******************************************************************************/
import java.util.Scanner;
public class Ex06

{
	public static void main(String[] args) {
     int a, b, par;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Entre com um número: ");
     a = ler.nextInt();
     
     par = a % 2;
     
     if (par == 0)
     System.out.println("Seu número é par");
     else
     System.out.println("Seu número é impar");

	}
}