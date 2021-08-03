package listas;
/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

import java.util.Scanner;

public class lista6exercicio1 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int maior = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite num número: ");
		num1 = read.nextInt();
		System.out.print("Digite num número: ");
		num2 = read.nextInt();
		System.out.print("Digite num número: ");
		num3 = read.nextInt();
		
		if(num1 > maior) {
			maior = num1;
		}
		if(num2 > maior) {
			maior = num2;
		}
		if(num3 > maior) {
			maior = num3;
		}
		
		System.out.print("O maior número é: "+maior);
	}
}
