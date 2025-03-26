/******************************************************************************
Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.
*******************************************************************************/
import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
     double a, b, c;
     Scanner ler = new Scanner(System.in);
     
     
     System.out.println("Insira o primeiro número: ");
     a = ler.nextDouble();
     System.out.println("Insira o segundo número: ");
     b = ler.nextDouble();
     System.out.println("Insira o terceiro número: ");
     c = ler.nextDouble();
     
     if (a > b && a >c)
     System.out.println("O maior número é o " + a);
     else if (b > a && b > c)
     System.out.println("O maior número é o " + b);
     else if (c > a && c > b)
     System.out.println("O maior número é o " + c);
	}
}
