/******************************************************************************
Exercicio 017
Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
*******************************************************************************/
public class Ex017 {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}