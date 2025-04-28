/******************************************************************************
10.
Faça um algoritmo que leia 10 números inteiros e, ao final, escreva quantos estão entre 0 e 100.
*******************************************************************************/
import java.util.Scanner;

public class Ex10_ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador = 0;
        int numero;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "° número: ");
            numero = ler.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contador);
    }
}
