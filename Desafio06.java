/******************************************************************************
Faça um programa em Java para resolver a equação de 2º grau.        
        Pedir para o usuário entrar com as variáveis A, B e C .
        Mostrar o valor de x1, x2 e delta.
       
        Usar a biblioteca:
          import java.lang.Math;
          Usar o "Math.sqrt" para encontrar a raiz quadrada. Ex.: raiz = Math.sqrt(9); // = 3
          Usar o "Math.pow" para fazer a potenciação Ex.: potencia= Math.pow(5,2); // = 25
          *Usar double se resultar em números decimais
*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class Desafio06
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a, b, c;
		double x1, x2, delta;
		
		System.out.println("Insira o valor de A: ");
		a = ler.nextInt();
		System.out.println("Insira o valor de B: ");
		b = ler.nextInt();
		System.out.println("Insira o valor de C: ");
		c = ler.nextInt();
		
		delta = Math.pow(b,2) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) /(2 * a);
		x2 = (-b - Math.sqrt(delta)) /(2 * a);
		
		
		System.out.println("O valor de delta é: " + delta);
		System.out.println("O valor do x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
	}
}
