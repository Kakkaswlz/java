/******************************************************************************
3) Faça um programa que leia uma matriz [5,5]de inteiros e verifique se existem elementos repetidos.
Mostrar a matriz e os números repetidos.
*******************************************************************************/
import java.util.Scanner;

public class Matriz03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] repetidos = new int[25]; 
        int repetidosCount = 0;

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

      
        for (int i = 0; i < 5*5; i++) {
            int valorAtual = matriz[i / 5][i % 5];
            boolean jaRegistrado = false;

         
            for (int k = 0; k < repetidosCount; k++) {
                if (repetidos[k] == valorAtual) {
                    jaRegistrado = true;
                    break;
                }
            }

            if (jaRegistrado) {
                continue; 
            }

            int count = 0;
            for (int m = 0; m < 5*5; m++) {
                if (matriz[m / 5][m % 5] == valorAtual) {
                    count++;
                }
            }

            if (count > 1) {
                repetidos[repetidosCount++] = valorAtual;
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        if (repetidosCount == 0) {
            System.out.println("Não existem números repetidos.");
        } else {
            System.out.println("Números repetidos:");
            for (int i = 0; i < repetidosCount; i++) {
                System.out.print(repetidos[i] + " ");
            }
        }

    }
}

