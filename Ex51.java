/******************************************************************************
Desenvolva um algoritmo que preencha aleatoriamente um vetor de 10 posicões com números entre 0 a 100. Calcule e escreva o maior, menor e a média desses números.
===================================================
Ex.:        import java.util.Random;
            // Criar um gerador de números aleatórios
            Random random = new Random();
===================================================
*******************************************************************************/
import java.util.Random;

public class Ex51 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101); 
            soma += numeros[i]; 

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double media = soma / (double) numeros.length;

        System.out.println("Números gerados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.printf("%nMaior número: ", maior);
        System.out.printf("Menor número: ", menor);
        System.out.printf("Média: ", media);
    }
}