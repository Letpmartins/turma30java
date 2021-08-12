package aplication;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor;
		int valores[] = new int[4];
		
		try {
			System.out.println("Digite a posição dentro do vetror 0-3: ");
			valor = scan.nextInt();
			System.out.println("Digite um valor: ");
			valores[valor] = scan.nextInt();
			
			System.out.printf("Posição: %d - Valor: %d", valor, valores[valor]);
			System.out.println("\nDivisão teste: "+(valores[valor]/valor));
		/*} catch (java.lang.ArithmeticException erro){
			System.out.println("Impossível dividir por zero.");
		} catch (java.util.InputMismatchException erro) {
			System.out.println("Digite um número inteiro.");
		} catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Digite um número inteiro entre 0 e 3.");*/
			
		} catch (Exception erro) { //erro genérico - trocável por Throwable, mas Exception é mais usado.
			System.out.println("\nERRO!");
			//erro.printStackTrace();
			System.out.println(erro.getMessage());
		} finally {
			System.out.println("Fechando o teclado.");
			scan.close();
		}
		
		
		//System.exit(0) - força o encerramento em qlqr lugar do programa. Deixa lixo na memória.
		
		System.out.println("FIM");
	}

}
