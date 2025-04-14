/******************************************************************************
Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar. 
Calcule o valor final com juros compostos de 2% ao mês. Mostre o valor final e o valor de cada parcela. 
Permita simular vários empréstimos.
*******************************************************************************/
import java.util.Scanner;
public class Desafio05 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        double valorEmprestimo, valorFinal, valorParcela;
        int numeroParcelas;
        final double taxaJuros = 0.02; 
        char resposta;
        boolean continuar = true;

        while (continuar) {
            
            System.out.print("Informe o valor do empréstimo: R$ ");
            valorEmprestimo = scanner.nextDouble();

            System.out.print("Informe o número de parcelas: ");
            numeroParcelas = scanner.nextInt();

            
            valorFinal = valorEmprestimo * Math.pow(1 + taxaJuros, numeroParcelas);
            valorParcela = valorFinal / numeroParcelas;

      
            System.out.println("Valor total a ser pago: R$" + valorFinal);
            System.out.println("Valor de cada parcela: R$" + valorParcela);

           
            System.out.print("Deseja simular outro empréstimo? (s/n): ");
            resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                continuar = false;
            }
        }
        System.out.println("Simulação encerrada.");
    }
}