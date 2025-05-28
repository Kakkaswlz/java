/******************************************************************************
5. Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
*******************************************************************************/
import java.util.Scanner;
public class Matriz05
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		double[] somaColunas = new double[3];
		
		System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }
        
        
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Somas das colunas:");
        for (int j = 0; j < somaColunas.length; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }
	}
}
