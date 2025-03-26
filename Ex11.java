/******************************************************************************
 Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito.
de 0 a 200 - nenhum crédito
de 201 a 400 - 20% do valor do saldo médio
de 401 a 600 - 30% do valor do saldo médio
acima de 601 - 40% do valor do saldo médio
*******************************************************************************/
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldoMedio, credito;
    
    
      System.out.print("Digite o saldo médio do cliente: R$ ");
        saldoMedio = ler.nextDouble();
      
       credito = 0;
        if (saldoMedio >= 0 && saldoMedio <= 200) {
            credito = 0; 
        } else if (saldoMedio >= 201 && saldoMedio <= 400) {
            credito = saldoMedio * 0.20; 
        } else if (saldoMedio >= 401 && saldoMedio <= 600) {
            credito = saldoMedio * 0.30; 
        } else if (saldoMedio > 600) {
            credito = saldoMedio * 0.40; 
        } else {
            System.out.println("Saldo médio inválido.");
        }

        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Valor do crédito: R$ " + credito);
    }
}