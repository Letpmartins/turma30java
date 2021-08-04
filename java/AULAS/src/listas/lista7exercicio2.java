package listas;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class lista7exercicio2 {
	public static void main(String[] args) {
		int numero;
		int pares=0;
		int impares=0;
		Scanner read = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("Digite um número: ");
			numero = read.nextInt();
			
			if(numero <= 0) {
				System.out.print("Número inválido, digite outro.\n");
				i--;
			} else if(numero%2 == 0) {
				pares++;
			}else if(numero%2 == 1) {
				impares++;
			}
			
		}
		
		System.out.printf("Pares: %d\n", pares);
		System.out.printf("Impares: %d", impares);
		read.close();
	}
}
