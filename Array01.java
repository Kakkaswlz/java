/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Array01
{
	public static void main(String[] args) {
		int[] numeros = new int [5];
		
		 numeros[0] = 10;
		 numeros[1] = 20;
		 numeros[2] = 30;
		 numeros[3] = 40;
		 numeros[4] = 50;
		 
	 for(int i=0; i <numeros.length; i++){
	       System.out.println("O " + (i+1) + " número é: " + numeros[i]);
	 }
	}
}
