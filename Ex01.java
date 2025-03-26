/******************************************************************************

Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.

*******************************************************************************/
import java.util.Scanner;
public class Ex01
{
  public static void main(String[] args) {
     double a, b, soma, media;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Entre com a primeira nota");
     a = ler.nextDouble();
     System.out.println("Entre com a segunda nota");
     b = ler.nextDouble();
     
     soma = a + b;
     media = soma / 2;
     
     if (media >= 7)
     System.out.println("Parabéns, você foi aprovado! Sua média final foi " + media);
     else 
     System.out.println("Infelizmente você foi reprovado, estude mais! Sua média final foi " + media);
	}
}
