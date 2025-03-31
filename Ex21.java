/******************************************************************************
Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 
*******************************************************************************/
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade, contIdadeSuperior50 = 0, contAlturaInferior150 = 0, contOlhosAzuis = 0, contPessoasRuivasSemOlhosAzuis = 0;
        double peso, altura, somaIdadesAlturaInferior150 = 0, mediaIdadesAlturaInferior150, porcentagemOlhosAzuis;
        char corOlhos, corCabelos;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Digite a idade: ");
            idade = ler.nextInt();
            
            System.out.print("Digite o peso (em kg): ");
            peso = ler.nextDouble();
            
            System.out.print("Digite a altura (em metros): ");
            altura = ler.nextDouble();
            ler.nextLine(); 
            
            System.out.print("Digite a cor dos olhos (A - Azul, P - Preto, V - Verde, C - Castanho): ");
            corOlhos = ler.nextLine().toUpperCase().charAt(0);
            
            System.out.print("Digite a cor dos cabelos (P - Preto, C - Castanho, L - Louro, R - Ruivo): ");
            corCabelos = ler.nextLine().toUpperCase().charAt(0);
            
          
            if (idade > 50 && peso < 60) {
                contIdadeSuperior50++;
            }
            
            if (altura < 1.50) {
                contAlturaInferior150++;
                somaIdadesAlturaInferior150 += idade;
            }
            
            if (corOlhos == 'A') {
                contOlhosAzuis++;
            }
            
            if (corCabelos == 'R' && corOlhos != 'A') {
                contPessoasRuivasSemOlhosAzuis++;
            }
        }


       mediaIdadesAlturaInferior150 = contAlturaInferior150 > 0 ? somaIdadesAlturaInferior150 / contAlturaInferior150 : 0;
       porcentagemOlhosAzuis = (double) contOlhosAzuis / 20 * 100;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + contIdadeSuperior50);
        System.out.printf("Média das idades das pessoas com altura inferior a 1,50: %.2f\n", mediaIdadesAlturaInferior150);
        System.out.printf("Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentagemOlhosAzuis);
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + contPessoasRuivasSemOlhosAzuis);

    }
}
