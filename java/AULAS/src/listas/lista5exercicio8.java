package listas;
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
 * e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% 
 * e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo 
 * ao consumidor. 
 */

import java.util.Scanner;

public class lista5exercicio8 {
	public static void main(String[] args) {
		
		double valorFabrica, distribuidor, impostos, valorConsumidor;
		Scanner leia = new Scanner(System.in);

		System.out.print("digite o valor de fábrica d automóvel: ");
		valorFabrica = leia.nextDouble();

		distribuidor = valorFabrica*0.28;
		impostos = valorFabrica*0.45;

		valorConsumidor = valorFabrica + distribuidor + impostos;

		System.out.print("O valor de venda do automóvel é: " +valorConsumidor);
		leia.close();
	}
	
}
