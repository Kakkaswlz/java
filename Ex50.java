/******************************************************************************
Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra no final mostre o valor gasto e o imposto.
a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
b) Mostrar os valores finais com e sem imposto.
*******************************************************************************/
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] compras = new double[10];
        double soma = 0;

        for (int i = 0; i < compras.length; i++) {
            System.out.print("Insira o valor da " + (i + 1) + "ª compra: ");
            compras[i] = ler.nextDouble(); 
        }

        for (int i = 0; i < compras.length; i++) {
            soma += compras[i];
        }

      
        double imposto;
        if (soma > 1200) {
            imposto = soma * 0.025;
        } else {
            imposto = soma * 0.008;
        }

        double valorFinal = soma + imposto;


        System.out.printf("Valor total das compras: R$", soma);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Valor final com imposto: R$", valorFinal);

    }
}