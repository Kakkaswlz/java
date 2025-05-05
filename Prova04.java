/******************************************************************************
4) Crie um programa em Java que leia os nomes e idades de 5 pessoas e, após isso,
informe se cada pessoa é maior ou menor de idade.
*******************************************************************************/
import java.util.Scanner;

public class Prova04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Insira o " + i + "º nome: ");
            String nome = ler.nextLine();
            
            System.out.println("Insira a " + i + "ª idade: ");
            int idade = ler.nextInt();
            ler.nextLine();
           
            if (idade >= 18) {
                System.out.println(nome + " é maior de idade.");
            } else {
                System.out.println(nome + " é menor de idade.");
            }
        }
  
    }
}