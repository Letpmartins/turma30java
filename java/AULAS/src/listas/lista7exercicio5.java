package listas;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
public class lista7exercicio5 {

	public static void main(String[] args) {
		int numero;
		int soma = 0;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = read.nextInt();
			
			soma += numero;
		} while(numero != 0);
		
		System.out.printf("Soma: %d", soma);
		read.close();
	}

}
