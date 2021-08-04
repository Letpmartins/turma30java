package listas;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/

public class lista7exercicio4 {

	public static void main(String[] args) {
		int idade;
		char sexo; //(1-feminino / 2-masculino / 3-Outros)
		char opcao;//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		char op = 'S'; //saida forçada do loop
		int contador = 0;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervososMais40=0, calmosMenos18=0;
		Scanner read = new Scanner(System.in);
		
		while(contador < 150 && op=='S') {
			System.out.print("Entre com uma idade: ");
			idade = read.nextInt();
			System.out.print("Entre com o sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = read.next().charAt(0);
			System.out.print("Entre com a opção (1-calmo / 2-nervoso / 3-agressivo): ");
			opcao = read.next().charAt(0);
			
			if(opcao == '1') pessoasCalmas++;
			if(sexo == '1' && opcao == '2') mulheresNervosas++;
			if(sexo == '2' && opcao == '3') homensAgressivos++;
			if(sexo == '3' && opcao == '1') outrosCalmos++;
			if(idade > 40 && opcao == '2') nervososMais40++;
			if(idade < 18 && opcao == '1') calmosMenos18++;
			
			contador++;
			System.out.print("Continuar [S/N]: ");
			op = read.next().toUpperCase().charAt(0);
		}
		
		System.out.printf("Pessoas calmas: %d", pessoasCalmas);
		System.out.printf("\nMulheres nervosas: %d", mulheresNervosas);
		System.out.printf("\nHomens agressivos: %d", homensAgressivos);
		System.out.printf("\nOutros calmos: %d", outrosCalmos);
		System.out.printf("\nPessoas nervosas com mais de 40 anos: %d", nervososMais40);
		System.out.printf("\nPessoas calmas com menos de 18 anos: %d", calmosMenos18);
		read.close();

	}

}
