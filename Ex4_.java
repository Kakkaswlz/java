/******************************************************************************
4.   
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner;

public class Ex4_ {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int numero = ler.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
