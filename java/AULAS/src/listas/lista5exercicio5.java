package listas;
/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
 */

import java.util.Scanner;

public class lista5exercicio5 {
	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double mediaPonderada;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite as tr�s notas do aluno, separadas por 'ENTER': ");
		nota1 = leia.nextDouble();
		nota2 = leia.nextDouble();
		nota3 = leia.nextDouble();

		mediaPonderada = ((nota1*2) + (nota2*3) + (nota3*5))/(2 + 3 + 5);

		System.out.print("A m�dia ponderada do alune �: " +mediaPonderada);
		leia.close();
	}
}
