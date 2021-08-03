package listas;
/*Faça um programa que entre com três números e coloque em ordem crescente.*/

import java.util.Scanner;

public class lista6exercicio2 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite num número: ");
		num1 = read.nextInt();
		System.out.print("Digite num número: ");
		num2 = read.nextInt();
		System.out.print("Digite num número: ");
		num3 = read.nextInt();
		
		if(num1<0 || num2<0 || num3<0) {
			System.out.printf("Um dos números não é válido!");
		} else if(num1<=num2 && num1<=num3){
			if(num2 <= num3) {
				System.out.printf("A ordem é: %d %d %d", num1, num2, num3);
			} else {
				System.out.printf("A ordem é: %d %d %d", num1, num3, num2);
			}
		} else if(num2<=num1 && num2<=num3){
			if(num1 <= num3) {
				System.out.printf("A ordem é: %d %d %d", num2, num1, num3);
			}else {
				System.out.printf("A ordem é: %d %d %d", num2, num3, num1);
			}
		} else if(num3<=num2 && num3<=num1){
			if(num1 <= num2) {
				System.out.printf("A ordem é: %d %d %d", num3, num1, num2);
			}else {
				System.out.printf("A ordem é: %d %d %d", num3, num2, num1);
			}
		}
		
		read.close();
	}
}
