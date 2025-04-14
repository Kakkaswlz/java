/******************************************************************************
Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, e o programa informa 
quantas cédulas de R$100, R$50, R$20, R$10 e R$5 serão entregues, com base nas cédulas disponíveis. 
Caso não seja possível realizar o saque com as cédulas, exiba uma mensagem de erro.
*******************************************************************************/
import java.util.Scanner;
public class Desafio04
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	 int cedula100 = 10;
	 int cedula50 = 20;
	 int cedula20 = 15;
	 int cedula10 = 30;
	 int cedula5 = 50;
	 int valorSaque, totalCedulas100 = 0, totalCedulas50 = 0, totalCedulas20 = 0, totalCedulas10 = 0, totalCedulas5 = 0;
	 
	   System.out.print("Insira o valor do saque: ");
	     valorSaque = ler.nextInt();
	     
	   if (valorSaque % 5 != 0){
	       System.out.println("Valor invalido, insira uma quantidade que seja multiplo de 5!");
	   } else{
	       
	       if (valorSaque >= 100){
	           totalCedulas100 = Math.min(valorSaque / 100, cedula100);
	           valorSaque -= totalCedulas100 * 100;
	       } if (valorSaque >= 50){
	           totalCedulas50 = Math.min(valorSaque / 50, cedula50);
	           valorSaque -= totalCedulas50 * 50;
	       } if (valorSaque >= 20){
	           totalCedulas20 = Math.min(valorSaque / 20, cedula20);
	           valorSaque -= totalCedulas20 * 20;
	       } if (valorSaque >= 10){
	           totalCedulas10 = Math.min(valorSaque / 10, cedula10);
	           valorSaque -= totalCedulas10 * 10;
	       } if (valorSaque >= 5){
	           totalCedulas5 = Math.min(valorSaque / 5, cedula5);
	           valorSaque -= totalCedulas5 * 5;
	       } 
	   }
	       if (valorSaque > 0) {
	           System.out.println("Não é possivel realizar o saque com as cédulas disponíveis");
	       } else{
	            System.out.println("Cédulas entregues:");
                System.out.println("R$100: " + totalCedulas100);
                System.out.println("R$50: " + totalCedulas50);
                System.out.println("R$20: " + totalCedulas20);
                System.out.println("R$10: " + totalCedulas10);
                System.out.println("R$5: " + totalCedulas5);
	       }

	}
}
