package listas;
/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
 * e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% 
 * e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo 
 * ao consumidor. 
 */

import java.util.Scanner;

public class lista5exercicio8 {
	public static void main(String[] args) {
		
		double valorFabrica, distribuidor, impostos, valorConsumidor;
		Scanner leia = new Scanner(System.in);

		System.out.print("digite o valor de f�brica d autom�vel: ");
		valorFabrica = leia.nextDouble();

		distribuidor = valorFabrica*0.28;
		impostos = valorFabrica*0.45;

		valorConsumidor = valorFabrica + distribuidor + impostos;

		System.out.print("O valor de venda do autom�vel �: " +valorConsumidor);
		leia.close();
	}
	
}
