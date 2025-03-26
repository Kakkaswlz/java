/******************************************************************************
 Construa um algoritmo para calcular o
valor a ser pago pelo período de estacionamento do automóvel (PAG). O usuário
entra com os seguintes dados: hora (HE) e minuto (ME) de entrada, hora (HS) e
minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou
seja, se passar um minuto ele cobra a hora inteira. O valor cobrado pelo
estacionamento é: •R$ 4,00 para 1 hora de estacionamento •R$ 6,00 para 2 horas
de estacionamento •R$ 1,00 por hora adicional (acima de 2 horas)
*******************************************************************************/
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int horaEntrada, minutoEntrada, totalMinutosEntrada, minutoSaida, horaSaida, totalMinutosSaida, totalMinutosEstacionamento, horasAdicionais;
        double valorPago;

    
        System.out.print("Digite a hora de entrada (0-23): ");
         horaEntrada = ler.nextInt();
        System.out.print("Digite os minutos de entrada (0-59): ");
         minutoEntrada = ler.nextInt();

      
        System.out.print("Digite a hora de saída (0-23): ");
         horaSaida = ler.nextInt();
        System.out.print("Digite os minutos de saída (0-59): ");
         minutoSaida = ler.nextInt();

         totalMinutosEntrada = horaEntrada * 60 + minutoEntrada;
         totalMinutosSaida = horaSaida * 60 + minutoSaida;

        
        if (totalMinutosSaida < totalMinutosEntrada) {
            totalMinutosSaida += 24 * 60; 
        }

         totalMinutosEstacionamento = totalMinutosSaida - totalMinutosEntrada;

        
         valorPago = 0;

        if (totalMinutosEstacionamento <= 60) {
            valorPago = 4.00; 
        } else if (totalMinutosEstacionamento <= 120) {
            valorPago = 6.00; 
        } else {
           
            horasAdicionais = (totalMinutosEstacionamento - 120 + 59) / 60; 
            valorPago = 6.00 + (horasAdicionais * 1.00); 
        }
        System.out.printf("O valor a ser pago pelo estacionamento é: R$ " + valorPago);
    }
}
