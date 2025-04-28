/* 
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. 
Utilize while.
*/

public class Ex1_
{
    public static void main(String[] args) {

        int impar = 51, par = 1;
        System.out.println("Os número pares de 1 a 50 são: ");
        while(par < 50){
            if (par % 2 == 0) {
            System.out.println(par);
        }
        par++;
        }
        System.out.println("Os número impares de 51 a 100 são: ");
        while (impar >= 51 && impar < 101){
            if (impar % 2 != 0 ){
            System.out.println(impar);
        }
        impar++;
        }


    }
}