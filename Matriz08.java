/******************************************************************************
8. Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
com o valor da soma dos elementos de mesmo índice. Ex:
*******************************************************************************/
import java.util.Scanner;
public class Matriz08{


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz1 = new int[5][2];
		int[][] matriz2 = new int[5][2];
		int[][] matriz3 = new int[5][2];

     System.out.println("Digite os elementos da 1° matriz 5x2:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = ler.nextInt();
            }
        }
                
     System.out.println("Digite os elementos da 2° matriz 5x2:");
        for (int k = 0; k < matriz2.length; k++) {
            for (int l = 0; l < 2; l++) {
                matriz2[k][l] = ler.nextInt();
            }
        }
         for (int f = 0; f < matriz3.length; f++) {
            for (int g = 0; g < 2; g++) {
                matriz3[f][g] = matriz1[f][g] + matriz2[f][g]; 
            }
        }
         
         System.out.println("1° Matriz 5x2:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
             System.out.println();
        }
        
        System.out.println("2° Matriz 5x2:");
        for (int k = 0; k < matriz2.length; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print(matriz2[k][l] + " ");
            }
             System.out.println();
        }
        System.out.println("A soma delas é:");
        for (int f = 0; f < matriz3.length; f++) {
            for (int g = 0; g < 2; g++) {
                System.out.print(matriz3[f][g] + " ");
            }
             System.out.println();
        }




	}
}

