/******************************************************************************
Exercicio 005
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês.
*******************************************************************************/
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
    
    System.out.println("Insira quanto você ganha por hora ");
      int valorHora = ler.nextInt();
    System.out.println("Quantas horas você trabalha no mês ");
      int qntdHoras = ler.nextInt();
    
    double salario = valorHora * qntdHoras;
    
    System.out.println("Seu salário é de R$" + salario);
    
    
    
	}
}
