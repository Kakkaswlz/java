/******************************************************************************
 Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.
*******************************************************************************/
import java.util.Scanner;
public class Ex05

{
	public static void main(String[] args) {
     double empr, parc, sal, max, val; 
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Insira o valor do seu salario atual: ");
     sal = ler.nextDouble();
     System.out.println("Insira o valor do empréstimo requisitado: ");
     empr = ler.nextDouble();
     System.out.println("Insira o número de parcelas: ");
     parc = ler.nextDouble();
     
     val = empr / parc;
     max = sal * 0.30;
     
     if (val <= max)
     System.out.println("Seu empréstimo foi aceito!");
     else
     System.out.println("Seu empréstimo foi recusado, sentimos muito");
	}
}
