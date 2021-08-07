package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		String alunes[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa",
				"Andrei Felipe Corr�a de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu",
				"Caio Saldanha Motta","C�ssia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento",
				"F�bio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Fl�vio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos",
				"Gustavo Mesquita Ferreira","Henrique Uriel Lopes","Jo�o Pedro Cruz Gomes","Jos� Paulo de Matos Ferreira Neto","Let�cia Porto Martins",
				"Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina",
				"Matheus de Brito Milani","Nat�lia Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa",
				"Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima",
				"Thiago da Silva Machado","Vin�cios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		
		int notas[] = new int[alunes.length];
		String matriculas[] = new String[alunes.length]; //MAT-0X
		boolean ativo[] = new boolean[alunes.length]; //true
		char opAtividade;
		char opContinua;
		String codigoMatricula;
		
		Scanner scan = new Scanner(System.in);
		//mostra todos os alunos.
		//pede matr�cula.
		//pede nota.
		//pergunta ativo ou n�o..
		//continua at� op s ou n.
		//mostra, com a regra:
		//nota<=5 estude mais
		//nota> �timo continue
		//s� os que tem nota
		
		for(int i=0; i<alunes.length; i++) {
			notas[i] = 0;
			ativo[i] = true;
			if(i<9) {
				matriculas[i] = "MAT-0"+(i+1);
			} else {
				matriculas[i] = "MAT-"+(i+1);
				};
		}
		
		System.out.print("Matr�cula \t Nome");
		for(int i=0; i<alunes.length; i++) {
			System.out.printf("\n%s \t\t %s",matriculas[i], alunes[i]);
		}
		
		do {

			System.out.print("\n\nSeletione um alune pela matr�cula: "); //seleciona o aluno
			codigoMatricula = scan.next();
			
			for(int i=0; i<alunes.length; i++) {
				if(codigoMatricula.equals(matriculas[i])) {
					
					System.out.printf("Nome: %s", alunes[i]);
					System.out.print("\nDigite a nota: "); //entra coma nota
					notas[i] = scan.nextInt();
					System.out.print("Alune ative? [S/N]: "); //define se ainda est� ativo
					opAtividade = scan.next().toUpperCase().charAt(0);
					
					if(opAtividade != 'S'){
						ativo[i] = false;
					}
				}
				
			}
			System.out.println();
			System.out.print("Continua? [S/N]:"); //segue o loop at� dizer n�o
			opContinua = scan.next().toUpperCase().charAt(0);
		} while(opContinua == 'S');
		
		System.out.print("Matr�cula\tStatus\tNota\tNome");
		for(int i=0; i<alunes.length; i++) {
			if(notas[i] != 0) {
				/*if(ativo[i] == true) {
					System.out.printf("\n%s \t %s \t %d \t ativo",matriculas[i], alunes[i], notas[i]);
				} else {
					System.out.printf("\n%s \t%s \t %d \t inativo",matriculas[i], alunes[i], notas[i]);
				}*/
				System.out.printf("\n%s\t\t%s\t  %d\t%s",matriculas[i], ((ativo[i]==true)?"Ativo":"Inativo"), notas[i], alunes[i]);
							
				/*if(notas[i] <= 5) {
					System.out.print("\tEstude mais.");
				} else {
					System.out.print("\t�timo. Continue assim.");
				}*/
				
				System.out.printf("\n%s",((notas[i] <= 5)?"Estude mais":"�timo. Continue assim."));
			}
			
		}
		
		scan.close();
	}

}
