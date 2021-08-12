package aplication;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor;
		int valores[] = new int[4];
		
		try {
			System.out.println("Digite a posi��o dentro do vetror 0-3: ");
			valor = scan.nextInt();
			System.out.println("Digite um valor: ");
			valores[valor] = scan.nextInt();
			
			System.out.printf("Posi��o: %d - Valor: %d", valor, valores[valor]);
			System.out.println("\nDivis�o teste: "+(valores[valor]/valor));
		/*} catch (java.lang.ArithmeticException erro){
			System.out.println("Imposs�vel dividir por zero.");
		} catch (java.util.InputMismatchException erro) {
			System.out.println("Digite um n�mero inteiro.");
		} catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Digite um n�mero inteiro entre 0 e 3.");*/
			
		} catch (Exception erro) { //erro gen�rico - troc�vel por Throwable, mas Exception � mais usado.
			System.out.println("\nERRO!");
			//erro.printStackTrace();
			System.out.println(erro.getMessage());
		} finally {
			System.out.println("Fechando o teclado.");
			scan.close();
		}
		
		
		//System.exit(0) - for�a o encerramento em qlqr lugar do programa. Deixa lixo na mem�ria.
		
		System.out.println("FIM");
	}

}
