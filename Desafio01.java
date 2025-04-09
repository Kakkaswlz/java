/******************************************************************************
Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. 
O programa deve validar se o voto é válido (1, 2, 3) 
e exibir ao final a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.
*******************************************************************************/
import java.util.Scanner;
public class Desafio01
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int voto, candidato1 = 0, candidato2 = 0, candidato3 = 0;
		double somatoria1, somatoria2, somatoria3;
		
		do{
	System.out.println("Sistema de votação");
            System.out.println("Deseja votar 1");
            System.out.println("Deseja votar 2");
            System.out.println("Deseja votar 3");
            System.out.println("0. Sair");
            System.out.print("-- Escolha uma opção: ");
	        voto = ler.nextInt();
	        
	    switch (voto) { 
	        case 1:
	            candidato1++;
	             System.out.println("Voto confirmado!");
	            break;
	       
	        case 2:  
	            candidato2++;
	            System.out.println("Voto confirmado!");
	            break;
	        
	        case 3:
	            candidato3++;
	            System.out.println("Voto confirmado!");
	            break;
	       
	        case 0:
	            System.out.print("Confirmando votos...");
	            break;
	            
	       default:
                 System.out.println("Voto inválido! Por favor, escolha 1, 2, 3 ou 0 para sair.");
                 break;
	         }
	      } while (voto != 0);
	      
	      System.out.println("Resultados da votação:");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");

       
        int maxVotos = Math.max(candidato1, Math.max(candidato2, candidato3));
        System.out.print("Vencedor(es): ");
        if (candidato1 == maxVotos) {
            System.out.print("Candidato 1 ");
        }
        if (candidato2 == maxVotos) {
            System.out.print("Candidato 2 ");
        }
        if (candidato3 == maxVotos) {
            System.out.print("Candidato 3 ");
        }
        System.out.println();
	      
	      
	}

	}

