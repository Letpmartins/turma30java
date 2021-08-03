package listas;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */


public class lista6exercicio4 {
	public static void main(String[] args) {
		double numero;
		Scanner read = new Scanner (System.in);
		
		System.out.print("Digite um número inteiro: ");
		numero = read.nextDouble();
		
		if(numero == 0 || numero <0){
			System.out.print("Número inválido!");
		} else if(numero%2 == 0){
			System.out.print("O número é par. \n");
			System.out.printf("A raíz quadrada de %.0f é %.2f.",numero ,Math.sqrt(numero));
		} else {
			System.out.print("O número é ímpar. \n");
			System.out.printf("O número %.0f elevado ao quadrado é %.0f." ,numero ,Math.pow(numero,2));
		}
		
		read.close();
	}
}
