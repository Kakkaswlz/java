/******************************************************************************
Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:

Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.
*******************************************************************************/
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        double nota, media;
        double soma = 0;
        int contadorNotas = 0;
        int contadorExcelente = 0;
        int contadorBom = 0;
        int contadorRegular = 0;
        int contadorInsuficiente = 0;

        do {
            System.out.println("Cadastro de notas");
            System.out.println("1) Inserir uma/outra prova");
            System.out.println("-1) Sair");
            System.out.print("-- Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o valor da nota (0 a 10): ");
                    nota = ler.nextDouble();

                    if (nota >= 0 && nota <= 10) {
                        soma += nota;
                        contadorNotas++;

                        if (nota >= 9) {
                            System.out.println("Nota Excelente");
                            contadorExcelente++;
                        } else if (nota >= 7) {
                            System.out.println("Nota Boa");
                            contadorBom++;
                        } else if (nota >= 5) {
                            System.out.println("Nota Regular");
                            contadorRegular++;
                        } else {
                            System.out.println("Nota Insuficiente");
                            contadorInsuficiente++;
                        }
                    } else if (nota != -1) {
                        System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
                    }
              
                    break;

                case -1:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != -1);

        if (contadorNotas > 0) {
            media = soma / contadorNotas;
            System.out.println("Média geral: " + media);
            System.out.println("Total de notas Excelente: " + contadorExcelente);
            System.out.println("Total de notas Boa: " + contadorBom);
            System.out.println("Total de notas Regular: " + contadorRegular);
            System.out.println("Total de notas Insuficiente: " + contadorInsuficiente);
        } else {
            System.out.println("Nenhuma nota foi cadastrada.");
        }

    }
}