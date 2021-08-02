package listas;
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/

import java.util.Scanner;

public class lista5exercicio2 {
	public static void main(String[] args) {
		int anos;
		int meses;
		int dias;
		int idadeEmDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Escreva quantos anos você tem em dias: ");
		idadeEmDias = leia.nextInt();
		
		anos = idadeEmDias/365;
		meses = (idadeEmDias%365)/30;
		dias = (idadeEmDias%365)%30;

		
		System.out.print("Você tem "+anos+" anos, "+meses+" meses e "+dias+" dias");
		leia.close();
	}
}
