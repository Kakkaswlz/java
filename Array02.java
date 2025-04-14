/******************************************************************************
Desenvolver um programa para ler o nome e idade de 5 pessoas. Guardar esses dados em array.
Apresentar o nome e a idade das pessoas maiores de idade.
*******************************************************************************/
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] idades = new int[5];

     
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° Nome: ");
            nomes[i] = ler.nextLine();

            System.out.print("Digite a " + (i + 1) + "° Idade: ");
            idades[i] = ler.nextInt();
            ler.nextLine(); 
        }

        

        for (int i = 0; i < nomes.length; i++) {
                System.out.println((i + 1) + " Pessoa: " + nomes[i] + " tem " + idades[i] + " anos");
            }
        }
    }