/******************************************************************************
Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.
*******************************************************************************/
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

 System.out.println("Insira o 1° número ");
   int numeroUm = ler.nextInt();
 System.out.println("Insira o 2° número ");
   int numeroDois = ler.nextInt();
   
 if (numeroUm > numeroDois){
     System.out.println("O maior número é " + numeroUm);
 }
 else{
     System.out.println("O maior número é " + numeroDois);
 }
	}
}
