/******************************************************************************
Exercicio 019
O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que
leia as um conjunto indeterminado de temperaturas,
e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
*******************************************************************************/
import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        double soma = 0;
        int contador = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        System.out.println("Digite as temperaturas (digite -1 para encerrar):");
        
        while (true) {
            temperatura = scanner.nextDouble();
            if (temperatura == -1) {
                break;
            }
            soma += temperatura;
            contador++;
            if (temperatura < menor) {
                menor = temperatura;
            }
            if (temperatura > maior) {
                maior = temperatura;
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }

        scanner.close();
    }
}