/******************************************************************************
 Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
*******************************************************************************/
import java.util.Scanner;
import java.time.LocalDate;

public class Ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoAtual, anoNascimento, idade, anosFaltando;
      
      
      
        System.out.print("Digite o ano de nascimento do rapaz: ");
        anoNascimento = ler.nextInt();
    
        anoAtual = LocalDate.now().getYear();
        idade = anoAtual - anoNascimento;
     
        if (idade < 18) {
             anosFaltando = 18 - idade;
            System.out.printf("Faltam %d anos para o alistamento militar. ", anosFaltando);
        } else if (idade == 18) {
            System.out.println("É o ano do alistamento militar.");
        } else {
            int anosPassados = idade - 18;
            System.out.printf("Já se passaram %d anos desde o alistamento militar.", anosPassados);
        }
    }
}