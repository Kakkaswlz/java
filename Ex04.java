/******************************************************************************
 A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.
*******************************************************************************/
import java.util.Scanner;
public class Ex04
{
	public static void main(String[] args) {
     double sal, bonus1, fim1, bonus2, fim2;
     int temp;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Insira o seu salario atual: ");
     sal = ler.nextDouble();
     System.out.println("Insira seu tempo de trabalho na empresa: ");
     temp = ler.nextInt();
     bonus1 = sal * 0.20;
     fim1 = sal * 1.20;
     bonus2 = sal * 0.10;
     fim2 = sal * 1.10;
     
     if (temp >= 5)
     System.out.println("Você vai ganhar um bonus de " + bonus1 + " e seu salario vai ser de " + fim1);
     else
     System.out.println("Você vai ganhar um bonus de " + bonus2 + " e seu salario vai ser de " + fim2);
	}
}
