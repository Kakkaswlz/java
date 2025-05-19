/*1) Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada
   */


public class Matriz01 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		
		matriz[1][0] = 5;
		matriz[1][1] = 6;
		matriz[1][2] = 7;
		matriz[1][3] = 8;
		
		matriz[2][0] = 9;
		matriz[2][1] = 10;
		matriz[2][2] = 11;
		matriz[2][3] = 12;
		
		matriz[3][0] = 13;
		matriz[3][1] = 14;
		matriz[3][2] = 15;
		matriz[3][3] = 16;
       
      
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}