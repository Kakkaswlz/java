/******************************************************************************
7. Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
transposta da primeira (troque as linhas por colunas)
*******************************************************************************/
import java.util.Scanner;
public class Matriz07
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int[][] matriz1 = new int[3][3];
		
		System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        
         System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matriz 3x3 transposta:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
	}
}
