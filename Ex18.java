/******************************************************************************
Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.
*******************************************************************************/
import java.util.Scanner;
public class Ex18
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int idade, soma = 0, maiorIdade = 0;
	    double media = 0;
	    for (int i = 1; i <= 20; i++){
	     System.out.println("Insira a " + i + " idade: ");
	     idade = ler.nextInt();
	     soma += idade;
	     media = soma / 20;
	     if (idade >= 18){
	         maiorIdade++;
	     }
	     }
	    System.out.println("A soma das idades é " + soma);
	    System.out.println("A média das idades é " + media);
	    System.out.println("A soma dos maiores de idade é " + maiorIdade );
	}
}