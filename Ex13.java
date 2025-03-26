/******************************************************************************
Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
-
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
*******************************************************************************/
import java.util.Scanner;
public class Ex13 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double largura, comprimento, area;
        String classificacao;

        
        System.out.print("Digite a largura do terreno em metros: ");
        largura = ler.nextDouble();
        System.out.print("Digite o comprimento do terreno em metros: ");
        comprimento = ler.nextDouble();

         area = largura * comprimento;

        System.out.println("A área do terreno é: " + area);

        if (area < 100) {
            classificacao = "TERRENO POPULAR";
        } else if (area >= 100 && area <= 500) {
            classificacao = "TERRENO MASTER";
        } else {
            classificacao = "TERRENO VIP";
        }

        System.out.println("Classificação do terreno: " + classificacao);
    }
}