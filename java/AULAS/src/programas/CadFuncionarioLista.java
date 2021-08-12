package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;
import classes.Terceiro;

public class CadFuncionarioLista {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char opcao; //T-terceiro, F-funcionário.
		char opSaida;
		List<Funcionario> folha = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		
		do {
			System.out.print("Digite a opção (T-terceiro, F-funcionário CLT): ");
			opcao = scan.next().toUpperCase().charAt(0);
			
			System.out.print("Digite a matrícula:");
			String matricula = scan.next();
			System.out.print("Digite quantidade de horas trabalhadas: ");
			int horas = scan.nextInt();
			System.out.print("Digite o valor da hora: ");
			double valorHora = scan.nextDouble();
			
						
			if(opcao == 'T') {
				System.out.print("Digite o valor do adicional: ");
				double valorAdicional = scan.nextDouble();
				
				folha.add(new Terceiro(matricula,horas,valorHora,valorAdicional));
			} else if (opcao == 'F') {
				folha.add(new Funcionario(matricula,horas,valorHora));
			}
			
			
			System.out.print("\nContinuar [S/N]: ");
			opSaida = scan.next().toUpperCase().charAt(0);
		} while (opSaida == 'S');
		
		System.out.println("\nFolha de Pagamentos:");
		System.out.println("Matrícula \t Salário");
		for(Funcionario pessoa : folha) {
			System.out.println(pessoa.getMatricula() +"\t \t"+ pessoa.salario());
		}
		
	}
	
	
	
}
