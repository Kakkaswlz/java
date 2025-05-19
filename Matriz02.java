/*2) Faça um programa que leia uma matriz 3x4 de inteiros,
substitua seus elementos negativos por 0 e imprima a matriz original e a modificada.*/
public class Matriz02 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];

        matriz[0][0] = 5;
        matriz[0][1] = -5;
        matriz[0][2] = 7;
        matriz[0][3] = -7;

        matriz[1][0] = 8;
        matriz[1][1] = -8;
        matriz[1][2] = 2;
        matriz[1][3] = -2;

        matriz[2][0] = 9;
        matriz[2][1] = -9;
        matriz[2][2] = 1;
        matriz[2][3] = -1;

        System.out.println("Matriz 3x4");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz 3x4 modificada");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }