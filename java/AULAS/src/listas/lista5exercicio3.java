package listas;
/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e 
 * mostre-o expresso em horas, minutos e segundos. 
 */

import java.util.Scanner;

public class lista5exercicio3 {
	public static void main(String[] args) {
		int intervalo;
		int horas;
		int minutos;
		int segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o intervalo de dura��o do evento, em segundos: ");
		intervalo = leia.nextInt();
		
		horas = intervalo/(60*60);
		minutos = (intervalo%(60*60))/60;
		segundos = (intervalo%(60*60))%60;

		System.out.print("O evento durou "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		leia.close();
	}
	
}
