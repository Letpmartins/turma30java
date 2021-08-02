package listas;
/*Um sistema de equações lineares do tipo: 
 * ax + by = c
 * dx + ey = f, 
 * pode ser resolvido segundo mostrado abaixo : 
 * x=(ce - bf)/(ae - bd), 	y = ((af - cd)/(ae - bd)
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
*/

import java.util.Scanner;

public class lista5exercicio7 {
	public static void main(String[] args) {
		int A, B, C, D, E, F;
		double x, y;
		Scanner leia = new Scanner(System.in);

		System.out.print("Defina os 6 coeficientes (a,b,c,d,e,f) das equações (dê ENTER para cada um): ");
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		D = leia.nextInt();
		E = leia.nextInt();
		F = leia.nextInt();

		x = ((C*E)-(B*F))/((A*E)-(B*D));
		y = ((A*F)-(C*D))/((A*E)-(B*D));

		System.out.print("As variáveis x e y são, respectivamente: "+x+" e "+y);
		leia.close();
	}
}
