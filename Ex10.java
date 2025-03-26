/******************************************************************************
Construa um algoritmo que determine
quanto será gasto para encher o tanque de um carro (VG), sabendo-se que o preço
da gasolina é de R$ 1,80 e o preço do álcool é de R$ 1,00. O usuário fornecerá
os seguintes dados: Tipo de carro (TC) (G – gasolina ou A – álcool) e
Capacidade do tanque (CT), em litros
*******************************************************************************/
import java.util.Scanner;
public class Ex10

{
	public static void main(String[] args) {
     double vg, g, eta, ct;
     char tc;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Digite G) para gasolina, ou, E) para alcool");
         tc = ler.next().toUpperCase().charAt(0);
     System.out.println("Digite qual a capacidade do tanque em litros: ");
         ct = ler.nextDouble();
     g = ct * 1.80;
     eta = ct * 1;
     if (tc == 'G')
     System.out.println("Você irá pagar " + g + " reais");
     else if (tc == 'E')
     System.out.println("Você irá pagar " + eta + " reais");
     else
     System.out.println("Insira uma letra valida");
	}
}