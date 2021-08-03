package listas;
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 * 10-14 infantil
 * 15-17 juvenil
 * 18-25 adulto
*/

import java.util.Scanner;

public class lista6exercicio3 {
	public static void main(String[] args) {
		int idade;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = read.nextInt();
		
		if(idade < 10 || idade > 25){
			System.out.print("Categoria não encontrada.");
		} else if(idade >= 10 && idade <= 14){
			System.out.print("Categoria: Infantil.");
		} else if(idade >= 15 && idade <= 17){
			System.out.print("Categoria: Juvenil.");
		} else if(idade >= 18 && idade <= 25){
			System.out.print("Categoria: Adulto.");
		}
		
	}

}
