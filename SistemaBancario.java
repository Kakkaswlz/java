/*************************************************************************************************************
  Desenvolver um sistema bancário básico que permita criar contas para múltiplos usuários, realizar depósitos,
  saques e consultar saldos, utilizando apenas arrays e estruturas de controle fundamentais do Java.
 *************************************************************************************************************/

import java.util.Scanner;

class Conta {
    int numeroConta;
    double saldo;

    Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nomes = new String[5];
        Conta[] contas = new Conta[5];
        int totalContas = 0;

        while (true) {
            System.out.println("\n********* Sistema Bancário ***********");
            System.out.println("1) Criar nova conta");
            System.out.println("2) Depositar");
            System.out.println("3) Sacar");
            System.out.println("4) Consultar saldo");
            System.out.println("5) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    if (totalContas >= 5) {
                        System.out.println("Limite de contas atingido.");
                        break;
                    }
                
                    System.out.print("Informe o nome do usuário: ");
                    String nome = ler.nextLine();

                    System.out.print("Informe o número da conta: ");
                    int numeroConta = ler.nextInt();

                    boolean contaExiste = false;
                    for (int i = 0; i < totalContas; i++) {
                        if (contas[i].numeroConta == numeroConta) {
                            contaExiste = true;
                            break;
                        }
                    }

                    if (contaExiste) {
                        System.out.println("Número de conta já existente.");
                    } else {
                        nomes[totalContas] = nome;
                        contas[totalContas] = new Conta(numeroConta, 0.0);
                        totalContas++;
                        System.out.println("Conta criada com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Informe o número da conta para depósito: ");
                    int contaDeposito = ler.nextInt();
                    boolean encontrouDeposito = false;

                    for (int i = 0; i < totalContas; i++) {
                        if (contas[i].numeroConta == contaDeposito) {
                            System.out.print("Informe o valor a depositar: ");
                            double valor = ler.nextDouble();
                            if (valor <= 0) {
                                System.out.println("Valor inválido.");
                            } else {
                                contas[i].saldo += valor;
                                System.out.println("Depósito realizado com sucesso.");
                            }
                            encontrouDeposito = true;
                            break;
                        }
                    }

                    if (!encontrouDeposito) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Informe o número da conta para saque: ");
                    int contaSaque = ler.nextInt();
                    boolean encontrouSaque = false;

                    for (int i = 0; i < totalContas; i++) {
                        if (contas[i].numeroConta == contaSaque) {
                            System.out.print("Informe o valor a sacar: ");
                            double valor = ler.nextDouble();
                            if (valor <= 0) {
                                System.out.println("Valor inválido.");
                            } else if (contas[i].saldo >= valor) {
                                contas[i].saldo -= valor;
                                System.out.println("Saque realizado com sucesso.");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            encontrouSaque = true;
                            break;
                        }
                    }

                    if (!encontrouSaque) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Informe o número da conta para consultar saldo: ");
                    int contaConsulta = ler.nextInt();
                    boolean encontrouConsulta = false;

                    for (int i = 0; i < totalContas; i++) {
                        if (contas[i].numeroConta == contaConsulta) {
                            System.out.println("Titular: " + nomes[i]);
                            System.out.println("Saldo atual: R$ " + contas[i].saldo);
                            encontrouConsulta = true;
                            break;
                        }
                    }

                    if (!encontrouConsulta) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    ler.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}