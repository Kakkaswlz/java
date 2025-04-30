/******************************************************************************
Exercicio 008
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
Imprima os dados do programa com as mensagens adequadas.
*******************************************************************************/
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
System.out.println("Quantos Kgs de peixe foram pescados: ");
  int pesoPeixe = ler.nextInt();
System.out.println("Quantos kgs de peixe excederam o limite (50Kgs) ");
  int excesso = ler.nextInt();
  
 double multa = excesso * 4; 
 
System.out.println("João deverá pagar R$" + multa + " por exceder o peso limite");

	}
}
