/******************************************************************************
Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.
*******************************************************************************/
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] numeros = new double[10];
        double soma = 0;
        
    for(int i=0; i < numeros.length; i++){
        System.out.println("Insira o " + (i + 1) + " número real");
        numeros[i] = ler.nextInt();
    }for (int i=1; i < numeros.length; i += 2){
        soma += numeros[i];
    }System.out.print("A somas do 10 valores em posições impares é: " + soma);
    
	}
}
