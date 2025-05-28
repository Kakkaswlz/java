/******************************************************************************
6. Crie um algoritmo informe qual o maior e qual o menor elemento existente em uma matriz
6x3.
*******************************************************************************/
import java.util.Scanner;
public class Matriz06
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[6][3];
		
		int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
		
		
		
		System.out.println("Digite os elementos da matriz 6x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ler.nextInt();
            if(matriz[i][j] > maior){
                maior = matriz[i][j];
            }if(matriz[i][j] < menor){
                menor = matriz[i][j];
            }
                 
            }
        }
        
         System.out.println("Matriz 3x4");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

	}
}
