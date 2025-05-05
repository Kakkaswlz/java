/******************************************************************************
Exercicio 023
Crie um vetor de 7 números inteiros e escreva um programa que encontre o maior número presente no vetor e exiba-o.
*******************************************************************************/
import java.util.Scanner;

public class Ex023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {15, 42, 7, 23, 89, 34, 56};
        int maiorNumero = numeros[0]; 
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i]; 
            }
        }
        System.out.println("O maior número presente no vetor é: " + maiorNumero);
    }
}