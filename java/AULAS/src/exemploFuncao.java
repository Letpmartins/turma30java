import java.util.Scanner;

public class exemploFuncao {

	public static void main(String[] args) {
		String nome;
		int anoNascimento;
		Scanner scan = new Scanner(System.in); /*instanciamento*/
		
		System.out.print("Digite seu nome: ");
		nome = scan.next();
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = scan.nextInt();

		coisinha();
		linha(50);
		System.out.printf("Olá, %s. Você tem %d anos. \n", nome, (2021-anoNascimento));
		linha(70);
		System.out.printf("Você é %s", tue(anoNascimento));
		scan.close();
		

	}
	
	public static void linha(int tamanho) {
		
		for(int i=0; i<tamanho; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}
	
	public static String tue(int ano) {
		int idade;
		String resposta;
		idade = 2021 -ano;
		
		if(idade < 13) resposta = "Criança.";
		else if (idade < 18) resposta = "Adolescente.";
		else if (idade < 30) resposta = "Jovem.";
		else if (idade < 45) resposta = "Adulto.";
		else resposta = "Cringe. xD";
		
		return resposta;
	}
	
	public static void coisinha() {
		System.out.print("\n♫♪♫♪♫♪♫♪♫\n");
	}

}
