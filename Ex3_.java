/******************************************************************************
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição.
Utilize while.
*******************************************************************************/
import java.util.Scanner;
 public class Ex3_
 {
 	public static void main(String[] args) {
 	    Scanner ler = new Scanner(System.in);
 	    int n;
 	    int i = 1;
 	    
   System.out.println("Insira a tabuada que deseja ver: ");
 	       n = ler.nextInt();
 	    
   while ( i < 10){
 	        i++;
 	        System.out.println(n + " x " + i + " = " + (n * i));
 	    }
 	}
 }