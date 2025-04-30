/******************************************************************************
Exercicio 006
Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a 
temperatura em graus Celsius. C = (5 * (F-32) / 9).
*******************************************************************************/
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Quantos Farenheit estão hoje?");
      int farenheit = ler.nextInt();
    
    double celsius = (5 * (farenheit-32) / 9);
    
    System.out.println("Estão " + celsius + " graus Celsius hoje");
	}
}
