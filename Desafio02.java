import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dificuldade, tentativa, aleatorio;

        do {
            System.out.println("Jogo de adivinhação");
            System.out.println("1) Dificuldade 1 ( 1 a 10 )");
            System.out.println("2) Dificuldade 2 ( 1 a 50 )");
            System.out.println("3) Dificuldade 3 ( 1 a 100 )");
            System.out.println("0. Sair");
            System.out.print("-- Escolha uma opção: ");
            dificuldade = ler.nextInt();

            switch (dificuldade) {
                case 1:
                    aleatorio = (int) (Math.random() * 10) + 1; 
                    break;
                case 2:
                    aleatorio = (int) (Math.random() * 50) + 1; 
                    break;
                case 3:
                    aleatorio = (int) (Math.random() * 100) + 1;
                    break;
                case 0:
                    System.out.println("Saindo");
                    continue;
                default:
                    System.out.println("Dificuldade inválida");
                    continue; 
            }

            int tentativasRestantes = 5;
            boolean acertou = false;

            while (tentativasRestantes > 0 && !acertou) {
                System.out.print("Chute um número: ");
                tentativa = ler.nextInt();
                tentativasRestantes--;

                if (tentativa == aleatorio) {
                    System.out.println("Parabéns! Você acertou!");
                    acertou = true;
                } else if (tentativa < aleatorio) {
                    System.out.println("Maior! Tentativas restantes: " + tentativasRestantes);
                } else {
                    System.out.println("Menor! Tentativas restantes: " + tentativasRestantes);
                }
            }

            if (!acertou) {
                System.out.println("Você não acertou! O número era: " + aleatorio);
            }

        } while (dificuldade != 0);
    }
}