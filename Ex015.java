/******************************************************************************
Exercicio 015
Faça um Programa que leia um número e exiba o dia correspondente da semana. 
(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
*******************************************************************************/
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

 System.out.println("Insira um número para descobrir seu dia correspondente da semana");
    int numero = ler.nextInt();
    
    
     if(numero == 1){
         System.out.println("Domingo!");
     } else if(numero == 2){
         System.out.println("Segunda!");
     }else if(numero == 3){
         System.out.println("Terça!");
     }else if(numero == 4){
         System.out.println("Quarta!");
     }else if(numero == 5){
         System.out.println("Quinta!");
     }else if(numero == 6){
         System.out.println("Sexta!");
     }else if(numero == 7){
         System.out.println("Sabado!");
     }else {
         System.out.println("Valor inválido");
     }
	}
}
