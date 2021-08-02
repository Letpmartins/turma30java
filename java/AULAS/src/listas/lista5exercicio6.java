package listas;
/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
 * P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �: 
 * d = ((x2-x1)^2+(y2-y1)^2)^(1/2) (^1/2 = raiz quadrada)
 */

import java.util.Scanner;

public class lista5exercicio6 {
	public static void main(String[] args) {
		double x1, y1, x2, y2, d;
		double radicandoX, radicandoY;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite as coordenadas do ponto 1 (d� ENTER a cada entrada): ");
		x1 = leia.nextDouble();
		y1 = leia.nextDouble();
		
		System.out.print("Digite as coordenadas do ponto 2 (d� ENTER a cada entrada): ");
		x2 = leia.nextDouble();
		y2 = leia.nextDouble();

		radicandoX = Math.pow((x2 - x1), 2);
		radicandoY = Math.pow((y2 - y1), 2);

		d = Math.sqrt((radicandoX + radicandoY));

		System.out.printf("A dist�ncia entre os pontos �: %.3f" ,d);
		leia.close();
	}
}
