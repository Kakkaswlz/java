/******************************************************************************
Exercicio 004
Faça um Programa que converta metros para centímetros.
*******************************************************************************/
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Insira o valor em metros ");
      int metros = ler.nextInt();
    
    double centimetros = metros * 100;
    
    System.out.println(metros + " metros dão " + centimetros + " centímetros");
	}
}
