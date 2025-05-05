/************
Exercicio 021
Crie um vetor de 10 inteiros e 
inicialize-o com valores sequenciais (1, 2, 3, ..., 10). 
Em seguida, imprima todos os valores do vetor na tela.
***************/
import java.util.Scanner;

public class Ex021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println("Valores do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}