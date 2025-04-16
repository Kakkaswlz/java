import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            idades[i] = scanner.nextInt();
            soma += idades[i];
        }

        System.out.println("A soma das idades é: " + soma);

        for (int i = 0; i < idades.length; i++) {
            String classificacao;
            if (idades[i] < 12) {
                classificacao = "Criança";
            } else if (idades[i] < 60) {
                classificacao = "Adulto";
            } else {
                classificacao = "Melhor idade";
            }
            System.out.println("A " + (i + 1) + "ª pessoa tem " + idades[i] + " anos e é classificada como: " + classificacao);
        }

    }
}