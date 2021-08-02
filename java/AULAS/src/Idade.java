import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		String nome;
		int anoNascimento;
		int idade;
		Scanner leia = new Scanner(System.in); /*instanciamento*/
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
	
		idade = 2021 - anoNascimento;
		
		System.out.println("Olá, "+nome+". Você tem "+idade+" anos.");
	}
}
