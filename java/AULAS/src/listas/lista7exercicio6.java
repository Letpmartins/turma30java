package listas;
/*Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class lista7exercicio6 {

	public static void main(String[] args) {
		int numero;
		int contador=0;
		double soma=0;
		double media;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = read.nextInt();
			
			if(numero != 0 && numero%3 ==0 ) {
				soma += numero;
				contador++;
			}
			
		} while(numero!=0);
		
		media = soma/contador;
		
		System.out.printf("Média dos múltipos de 3: %.2f", media);
		read.close();
	}

}
