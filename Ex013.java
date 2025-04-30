/******************************************************************************
Exercicio 013
Faça um Programa que leia três números e mostre o maior deles.
*******************************************************************************/
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

System.out.println("Insira o 1° número: ");
  int numeroUm = ler.nextInt();
System.out.println("Insira o 2° número: ");
  int numeroDois = ler.nextInt();
System.out.println("Insira o 3° número: ");
  int numeroTres = ler.nextInt();
  
  if ( numeroUm > numeroDois && numeroUm > numeroTres){
      System.out.println("O maior número é " + numeroUm);
  }else if ( numeroDois > numeroUm && numeroDois > numeroTres){
      System.out.println("O maior número é " + numeroDois);
  }else {
      System.out.println("O maior número é " + numeroTres);
  }
	}
}
