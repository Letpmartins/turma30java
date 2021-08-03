package listas;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */


public class lista6exercicio4 {
	public static void main(String[] args) {
		double numero;
		Scanner read = new Scanner (System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		numero = read.nextDouble();
		
		if(numero == 0 || numero <0){
			System.out.print("N�mero inv�lido!");
		} else if(numero%2 == 0){
			System.out.print("O n�mero � par. \n");
			System.out.printf("A ra�z quadrada de %.0f � %.2f.",numero ,Math.sqrt(numero));
		} else {
			System.out.print("O n�mero � �mpar. \n");
			System.out.printf("O n�mero %.0f elevado ao quadrado � %.0f." ,numero ,Math.pow(numero,2));
		}
		
		read.close();
	}
}
