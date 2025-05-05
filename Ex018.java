/******************************************************************************
Exercicio 018
Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
*******************************************************************************/
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
     
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println("Números no intervalo entre " + num1 + " e " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}