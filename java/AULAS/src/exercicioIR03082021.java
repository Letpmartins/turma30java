import java.util.Scanner;

public class exercicioIR03082021 {
	public static void main(String[] args) {
		String nome;
		double salarioBruto;
		double imposto;
		double salarioDeduzido;
		char genero;
		Scanner read = new Scanner(System.in);
		String saudacao="";
		
		System.out.print("Digite seu nome completo: ");
		nome = read.nextLine();
		System.out.print("Escolha como gostaria de ser tratado (M - masculino, F - feminino, N - neutro): ");
		genero = read.next().toUpperCase().charAt(0);
		System.out.print("Digite seu salário: ");
		salarioBruto = read.nextDouble();
		
		if(genero == 'M'){
			saudacao = "Presado Sr.";
		} else if(genero == 'F'){
			saudacao = "Presada Sra.";
		} else if(genero == 'N') {
			saudacao = "Presade Sre.";
		}
		
		if(salarioBruto <= 2000) {
			System.out.printf("%s %s. Seu salário é isento de imposto.",saudacao, nome);
		} else if(salarioBruto >= 2000 && salarioBruto <= 5000) {
			imposto = salarioBruto*0.15;
			salarioDeduzido = salarioBruto*0.85;
			
			System.out.printf("%s %s. Se imposto é de 15%",saudacao, nome);
			System.out.printf("\nValor do imposto: %f ." ,imposto);
			System.out.printf("\nSalário bruto com a dedução do imposto: %f ." ,salarioDeduzido);
		} else if(salarioBruto > 5000) {
			imposto = salarioBruto*0.25;
			salarioDeduzido = salarioBruto*0.75;
			
			System.out.printf("%s %s. Se imposto é de 25%",saudacao, nome);
			System.out.printf("\nValor do imposto: %f ." ,imposto);
			System.out.printf("\nSalário bruto com a dedução do imposto: %f." ,salarioDeduzido);
			
		}
		
	}
}
